package com.example.shopping.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.shopping.model.users.User;
import com.example.shopping.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    // 회원가입 페이지
    @GetMapping("users/register")
    public String registerForm(Model model) {
        model.addAttribute("registerForm", new User());
        return "users/register";
    }

    // 회원가입
    @PostMapping("users/register")
    public String register(@ModelAttribute User user) {
        log.info("user: {}", user);
        userService.register(user);
        return "redirect:/";
    }

    // 로그인 페이지
    @GetMapping("users/login")
    public String loginForm(Model model) {
        model.addAttribute("loginForm", new User());
        return "users/login";
    }

    // 로그인
    @PostMapping("users/login")
    public String login(@ModelAttribute User user,
                        HttpSession session) {
        User findUser = userService.findUser(user.getUsername());
        if (findUser != null) {
            if (findUser.getPassword().equals(user.getPassword())) {
                session.setAttribute("loginUser", findUser);

            }
        }
        return "redirect:/";
    }

    // 로그아읏
    @GetMapping("users/logout")
    public String logout(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

}
