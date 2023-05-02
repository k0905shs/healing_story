package com.km.healing.entity;

import com.km.healing.common.category.TestCode;
import com.km.healing.entity.base.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PsyQues extends BaseTimeEntity {
    @Column(name = "psy_ques_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "test_code")
    private TestCode testCode;
}
