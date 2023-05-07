package com.km.repository.memberPsyTest;

import com.km.model.PsyQuesDto;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MemberPsyTestBatchRepository {

    private final JdbcTemplate jdbcTemplate;

    public MemberPsyTestBatchRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void batchInsertTestResult(final PsyQuesDto.testResultParam testResultParam) {
        Long memberTestId = testResultParam.getMemberTestId();
        List<PsyQuesDto.testResult> batchList = testResultParam.getTestResultList();
        jdbcTemplate.batchUpdate(
                "INSERT INTO MEMBER_TEST_PSY (point, member_test_id, psy_ques_id, created_at, updated_at)" +
                        "VALUES (?,?,?,NOW(), NOW())",
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, String.valueOf(batchList.get(i).getPoint()));
                        ps.setString(2, memberTestId.toString());
                        ps.setString(3, batchList.get(i).getPsyQuesId().toString());
                    }
                    @Override
                    public int getBatchSize() {
                        return batchList.size();
                    }
                }
        );

    }
}

