package com.km.entity;

import com.km.entity.base.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberTestPsy extends BaseTimeEntity {

    @Column(name = "member_test_psy_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "point")
    private int point;

    @ManyToOne
    @JoinColumn(name = "member_test_id")
    private MemberTest memberTest;

    @ManyToOne
    @JoinColumn(name = "psy_ques_id")
    private PsyQues psyQuestion;
}
