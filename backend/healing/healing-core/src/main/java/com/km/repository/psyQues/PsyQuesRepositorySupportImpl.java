package com.km.repository.psyQues;

import com.km.entity.QPsyQues;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PsyQuesRepositorySupportImpl extends QuerydslRepositorySupport implements PsyQuesRepositorySupport{

    private final JPAQueryFactory jpaQueryFactory;

    public PsyQuesRepositorySupportImpl(EntityManager em) {
        super(QPsyQues.class);
        super.setEntityManager(em);
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

}
