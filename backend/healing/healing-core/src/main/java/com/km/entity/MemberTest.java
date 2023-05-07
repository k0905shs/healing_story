package com.km.entity;

import com.km.common.category.TestCode;
import com.km.entity.base.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MEMBER_TEST")
public class MemberTest extends BaseTimeEntity {
    @Column(name = "member_test_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "test_code")
    @Enumerated(EnumType.STRING)
    private TestCode testCode;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public MemberTest(TestCode testCode, Member member) {
        this.testCode = testCode;
        this.member = member;
    }
}
