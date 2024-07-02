package com.example.order.config;

import com.example.order.interceptor.LoginCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	private String[] excludePaths = {"/", "/member/join", "/member/login", "/member/logout", "/css/**", "/*.ico", "/error"};
	
	// 인터셉터 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginCheckInterceptor())
		.order(1)
		.addPathPatterns("/**")
		.excludePathPatterns(excludePaths);
	}
}
