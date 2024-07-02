package com.example.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.example.board.service.PrincipalOAuthUserService;

import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
	
	private final AuthenticationFailureHandler authenticationFailureHandler;
	private final PrincipalOAuthUserService principalOAuthUserService;
	
	@Bean
	public PasswordEncoder encoder() {
		//비크립트라는 방식으로 패스워드를 암호화하는 객체
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			//Cross-Site-Request-Forgery 보호 기능 비활성화
			.csrf().disable()
			//iframe으로 접근이 안되도록 하는 설정을 비활성화(iframe으로 접근이 가능하게 하겠다.)
			.headers().frameOptions().disable()
			.and()
			//URL별 권한접근 제어
			.authorizeRequests()
			.antMatchers("/","/member/join","/member/login","/member/login-failed","/member/logout").permitAll()
			.antMatchers("/css/*","/js/*","/favicon.ico","/error").permitAll()
			// "/admin" 하위의 모든 요청은 인증 후에 ADMIN 권한을 가진 사용자만 접근 가능
			.antMatchers("/admin/**").hasAnyRole("ADMIN")
			//이외의 모든 경로는 인증을 받아야 접근 가능
			.anyRequest().authenticated()
			.and()
			//폼 로그인방식을 사용하겠다.
			.formLogin()
			//아이디 필드의 기본값은 username이고 다른 이름으르 사용할 시 이름을 지정함.
			.usernameParameter("member_id")
			//개발자가 만든 로그인페이지를 사용하겠다.
			//설정을 하지 않으면 기본값이 "/login"이기 때문에 스프링이 사용하는 기본 로그인페이지기 호출
			.loginPage("/member/login")
			//로그인 인증처리를 하는 URL
			.loginProcessingUrl("/member/login")
			//로그인에 성공했을때 이동할 URL
			.defaultSuccessUrl("/member/login-success")
			//로그인에 실패했을때 이동할 URL
//			.failureUrl("/member/login-failed")
			.failureHandler(authenticationFailureHandler)
			.and()
			.logout()
			//로그아웃 URL 지정
			.logoutUrl("/member/logout")
			//로그아웃 성공 후 리다이렉트될 주소
			.logoutSuccessUrl("/")
			//세션 삭제
			.invalidateHttpSession(true)
			//쿠키 삭제
			.deleteCookies("JSESSIONID")
			.and()
			.oauth2Login()
			// oauth2 로그인에 성공하면 principalOAuthUserService에서 인증을 진행하겠다.
			.userInfoEndpoint()
			.userService(principalOAuthUserService);
			
		return http.build();
			
	}
}





