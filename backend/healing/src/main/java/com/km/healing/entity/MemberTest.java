package com.km.healing.entity;

import com.km.healing.common.category.TestCode;
import com.km.healing.entity.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberTest extends BaseTimeEntity {
    @Column(name = "member_test_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "test_code")
    @Enumerated(EnumType.STRING)
    private TestCode testCode;


}
