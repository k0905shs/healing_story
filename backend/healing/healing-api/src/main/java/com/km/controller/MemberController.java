package com.km.controller;

import com.km.entity.Member;
import com.km.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    //TODO : 멀티 모듈 작동 여부 확인 코드 꼭 제거할 것
    private final MemberRepository memberRepository;


    @GetMapping("/list")
    public List<Member> memberListTest() {
        return memberRepository.findAllBy();
    }
}
