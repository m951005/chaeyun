package com.example.order.controller;

import com.example.order.model.member.JoinMemberForm;
import com.example.order.model.member.LoginForm;
import com.example.order.model.member.Member;
import com.example.order.repository.MemberRepository;
import com.example.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("member")
@Controller
public class MemberController {

    private final MemberRepository memberRepository;

    // 회원가입 페이지 이동
    @GetMapping("join")
    public String joinForm(Model model) {
    	model.addAttribute("join", new JoinMemberForm());
        return "member/joinForm";
    }

    // 회원가입
    @PostMapping("join")
    public String join(@Validated @ModelAttribute("join") JoinMemberForm joinMemberForm,
    					BindingResult result) {
    	log.info("join: {}", joinMemberForm);
    	
    	if(result.hasErrors()) {
    		return "/member/joinForm";
    	}
    	
    	Member findMemberById = memberRepository.findMemberById(joinMemberForm.getMember_id());
    	if(findMemberById != null) {
    		result.reject("duplicate ID", "이미 사용중인 아이디 입니다.");
    		return "member/joinForm";
    	}
    	
    	memberRepository.saveMember(JoinMemberForm.toMember(joinMemberForm));
    	
        return "redirect:/";
    }

    // 로그인 페이지 이동
    @GetMapping("login")
    public String loginForm(Model model) {
    	
    	model.addAttribute("login", new LoginForm());
    	
        return "member/loginForm";
    }

    // 로그인
    @PostMapping("login")
    public String login(@Validated @ModelAttribute("login") LoginForm loginForm,
    					BindingResult result,
    					HttpServletRequest request,
    					@RequestParam(defaultValue = "/") String redirectURL) {
    	if(result.hasErrors()) {
    		return "member/loginForm";
    	}
    	
    	Member findMemberById = memberRepository.findMemberById(loginForm.getMember_id());
    	
    	if(findMemberById == null || !findMemberById.getPassword().equals(loginForm.getPassword())) {
    		result.reject("loginError", "아이디가 없거나 패스워드가 다릅니다.");
    		return "member/loginForm";
    	}
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("loginMember", findMemberById);
    	
        return "redirect:" + redirectURL;
    }

    // 로그아웃
    @GetMapping("logout")
    public String logout(HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	
    	if(session != null) {
    		session.invalidate();
    	}
    	
        return "redirect:/";
    }

}
