package com.km.repository.psyQues;

import com.km.common.category.TestCode;
import com.km.entity.PsyQues;
import com.km.entity.QPsyQues;
import com.km.model.PsyQuesDto;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.hibernate.criterion.Projection;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static com.km.entity.QPsyQues.psyQues;

@Repository
public class PsyQuesRepositorySupportImpl extends QuerydslRepositorySupport implements PsyQuesRepositorySupport{

    private final JPAQueryFactory jpaQueryFactory;

    public PsyQuesRepositorySupportImpl(EntityManager em) {
        super(QPsyQues.class);
        super.setEntityManager(em);
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<PsyQuesDto.psyTest> findByTestCode(final PsyQuesDto.testCodeParam testCodeParam) {
        return jpaQueryFactory.select(Projections.constructor(PsyQuesDto.psyTest.class,
                        psyQues.id, psyQues.question))
                .from(psyQues)
                .where(eqTestCode(testCodeParam.getTestCode()))
                .fetch();
    }

    private BooleanExpression eqTestCode(TestCode testCode) {
        if (testCode == null) {
            return null;
        }
        return psyQues.testCode.eq(testCode);
    }



}
