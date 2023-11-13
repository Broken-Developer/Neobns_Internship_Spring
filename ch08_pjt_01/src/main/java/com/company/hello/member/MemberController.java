package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    // 1. new를 이용한 서비스 객체 생성 및 이용
//    MemberService memberService = new MemberService();

    // 2. 빈 객체 생성 및 의존 객체 자동 주입
    @Autowired
    MemberService memberService;

    @RequestMapping("/signUp")
    public String signUp() {
        return "sign_up";
    }

    @RequestMapping("/signIn")
    public String signIn() {
        return "sign_in";
    }

    @RequestMapping("/signUpConfirm")
    public String signUpConfirm(MemberVo memberVo) {
        System.out.println("[MemberController] signUpConfirm()");

        System.out.println("m_id : " + memberVo.getM_id());
        System.out.println("m_pw : " + memberVo.getM_pw());
        System.out.println("m_mail : " + memberVo.getM_mail());
        System.out.println("m_phone : " + memberVo.getM_phone());

        memberService.signUpConfirm(memberVo);

        return "sign_up_ok";
    }

    @RequestMapping("/signInConfirm")
    public String signInConfirm(MemberVo memberVo) {
        System.out.println("[MemberController] signInConfirm()");

        // 서비스 호출
        MemberVo signInedMember = memberService.signInConfirm(memberVo);

        if (signInedMember != null) {
            // 로그인 성공
            return "sign_in_ok";
        } else {
            // 로그인 실패
            return "sign_in_ng";
        }

//        return null;
    }
}
