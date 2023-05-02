package com.km.healing.entity;

import com.km.healing.repository.member.MemberRepository;
import com.km.healing.repository.memberTest.MemberTestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberTestEntityTest {

    @Autowired
    private MemberTestRepository memberTestRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void mappingTest() {
        MemberTest memberTest = memberTestRepository.findById(1L).orElseThrow();
        Member member = memberRepository.findById(1L).orElseThrow();
        Member testMember = memberTest.getMember();
        assertThat(member).isEqualTo(testMember);

    }

}