package com.km.healing.entity;

import com.km.healing.common.category.Mbit;
import com.km.healing.entity.base.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "loginId", "password", "mbti"})
@Table(name = "MEMBER")
public class Member extends BaseTimeEntity {

    @Column(name = "member_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "mbti")
    @Enumerated(EnumType.STRING)
    private Mbit mbti;

    public void changePassword(final String password) {
        this.password = password;
    }

    @Builder
    public Member(String loginId, String password, Mbit mbit) {
        super();
        this.loginId = loginId;
        this.password = password;
        this.mbti = mbit;
    }
}
