package com.example.board.controller;

import com.example.board.config.PrincipalDetails;
import com.example.board.config.UserInfo;
import com.example.board.model.member.LoginForm;
import com.example.board.model.member.Member;
import com.example.board.model.member.MemberJoinForm;
import com.example.board.repository.MemberMapper;
import com.example.board.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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

    private final MemberService memberService;

    // 회원가입 페이지 이동
    @GetMapping("join")
    public String joinForm(Model model) {
        // joinForm.html 의 필드 세팅을 위해 model 에 빈 MemberJoinForm 객체 생성하여 저장한다
        model.addAttribute("joinForm", new MemberJoinForm());
        // member/joinForm.html 페이지를 리턴한다.
        return "member/joinForm";
    }

    // 회원가입
    @PostMapping("join")
    public String join(@Validated @ModelAttribute("joinForm") MemberJoinForm joinForm,
                       BindingResult result) {
        log.info("joinForm: {}", joinForm);

        // validation 에 에러가 있으면 가입시키지 않고 member/joinForm.html 페이지로 돌아간다.
        if (result.hasErrors()) {
            return "member/joinForm";
        }
        // 이메일 주소에 '@' 문자가 포함되어 있는지 확인한다.
        if (!joinForm.getEmail().contains("@")) {
            // BindingResult 객체에 GlobalError 를 추가한다.
            result.reject("emailError", "이메일 형식이 잘못되었습니다.");
            // member/joinForm.html 페이지를 리턴한다.
            return "member/joinForm";
        }
        // 사용자로부터 입력받은 아이디로 데이터베이스에서 Member 를 검색한다.
        Member member = memberService.findMember(joinForm.getMember_id());
        // 사용자 정보가 존재하면
        if (member != null) {
            log.info("이미 가입된 아이디 입니다.");
            // BindingResult 객체에 GlobalError 를 추가한다.
            result.reject("duplicate ID", "이미 가입된 아이디 입니다.");
            // member/joinForm.html 페이지를 리턴한다.
            return "member/joinForm";
        }
        // MemberJoinForm 객체를 Member 타입으로 변환하여 데이터베이스에 저장한다.
        memberService.saveMember(MemberJoinForm.toMember(joinForm));
        // 메인 페이지로 리다이렉트한다.
        return "redirect:/";
    }

    // 로그인 페이지 이동
    @GetMapping("login")
    public String loginForm(@RequestParam(value="error", required = false) boolean error,
    						@RequestParam(value="message", required = false) String message,
    						Model model) {
    	log.info("error: {}", error);
    	log.info("message: {}", message);
        
    	if(error) {
    		model.addAttribute("error", error);
    		model.addAttribute("message", message);
    	}
    	
    	// member/loginForm.html 에 필드 셋팅을 위해 빈 LoginForm 객체를 생성하여 model 에 저장한다.
        model.addAttribute("loginForm", new LoginForm());
        // member/loginForm.html 페이지를 리턴한다.
        return "member/loginForm";
    }
    
    
    @GetMapping("login-success")
    public String loginSuccess() {
    	log.info("로그인 성공");
    	
    	return "redirect:/";
    }
    
    @GetMapping("login-failed")
    public String loginFailed() {
    	log.info("로그인 실패");
    	
    	return "redirect:/";
    }
    
    // 로그아웃
    @GetMapping("logout")
    public String logout(HttpServletRequest request) {
        log.info("로그아웃 호출");
    	// Request 객체에서 Session 정보를 가져온다.
        HttpSession session = request.getSession(false);
        // 세션이 존재하면 세션의 모든 데이터를 리셋한다.
        if (session != null) {
            session.invalidate();
        }
        // 메인 페이지로 리다이렉트 한다.
        return "redirect:/";
    }
}
