package com.km.healing.entity;

import com.km.healing.common.category.Mbit;
import com.km.healing.repository.member.MemberRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberEntityTest {

    @Autowired
    private EntityManager em;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void memberSave() throws InterruptedException {
        Member member = new Member("test11", "password", Mbit.INFP);
        Member savedMember = memberRepository.save(member);
        assertThat(member).isEqualTo(savedMember);
        System.out.println(member);
        //update 전 created updated 시간 비교
        assertThat(savedMember.getCreatedAt().isEqual(savedMember.getUpdatedAt())).isTrue();
        savedMember.changePassword("changedPassword");
        Thread.sleep(1000);
        memberRepository.saveAndFlush(member); //flush

        //update 후
        assertThat(savedMember.getCreatedAt().isEqual(savedMember.getUpdatedAt())).isFalse();
    }

}