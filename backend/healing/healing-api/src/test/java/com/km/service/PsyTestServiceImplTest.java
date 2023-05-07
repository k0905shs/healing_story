package com.km.service;

import com.km.common.category.Mbit;
import com.km.common.category.TestCode;
import com.km.entity.Member;
import com.km.entity.MemberTest;
import com.km.model.PsyQuesDto;
import com.km.repository.member.MemberRepository;
import com.km.repository.memberPsyTest.MemberPsyTestBatchRepository;
import com.km.repository.memberTest.MemberTestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@Transactional
//@Rollback(value = false)
class PsyTestServiceImplTest {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberTestRepository memberTestRepository;

    @Autowired
    private MemberPsyTestBatchRepository memberPsyTestBatchRepository;

    @Test
    public void psyTestSave() {
        Member member = new Member("login", "passwd", Mbit.INFP);
        Member savedMember = memberRepository.save(member);

        PsyQuesDto.testResultParam testResultParam = new PsyQuesDto.testResultParam();
        testResultParam.setMemberId(savedMember.getId());

        List<PsyQuesDto.testResult> testResultList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            PsyQuesDto.testResult testResult = new PsyQuesDto.testResult((long) (i + 1), 3);
            testResultList.add(testResult);
        }

        MemberTest memberTest = new MemberTest(TestCode.STRESS, savedMember);
        MemberTest savedMemberTestId = memberTestRepository.save(memberTest);

        testResultParam.setTestResultList(testResultList); //testResult
        testResultParam.setMemberTestId(savedMemberTestId.getId());
        memberPsyTestBatchRepository.batchInsertTestResult(testResultParam);

    }
}