package com.example.board.service;

import java.util.Map;

import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.example.board.config.PrincipalDetails;
import com.example.board.model.member.Member;
import com.example.board.model.member.RoleType;
import com.example.board.repository.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrincipalOAuthUserService extends DefaultOAuth2UserService{
	
	private final MemberMapper memberMapper;
	
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		log.info("getClientRegistration: {}", userRequest.getClientRegistration());
		log.info("getAccessToken: {}", userRequest.getAccessToken());
		
		OAuth2User oAuthUser = super.loadUser(userRequest);
		
		log.info("getAttributes: {}", oAuthUser.getAttributes());
		
		String provider = userRequest.getClientRegistration().getRegistrationId();
		String email = null;
		String name = null;
		String image = null;
		
		switch(provider) {
		case "google":
			email = oAuthUser.getAttribute("email");
			name = oAuthUser.getAttribute("name");
			break;
		
		case "kakao":
			Map<String, Object> kakaoAccount = oAuthUser.getAttribute("properties");
			name = (String) kakaoAccount.get("nickname");
			email = name;
			image = (String) kakaoAccount.get("profile_image");
			break;
		}
		
//		Member member = new Member();
//		member.setMember_id(email);
//		member.setPassword("social");
//		member.setName(name);
//		member.setEmail(email);
//		member.setRole(RoleType.ROLE_USER);
//		member.setProvider(provider);
		
		Member member = Member.builder()
							  .member_id(email)
							  .password("social")
							  .name(name)
							  .email(email)
							  .role(RoleType.ROLE_USER)
							  .provider(provider)
							  .build();
		
		Member findMember = memberMapper.findMember(member.getMember_id());
		
		if(findMember == null) {
			//자동회원가입
			memberMapper.saveMemberSocial(member);
		}
		
		return new PrincipalDetails(member, oAuthUser.getAttributes());
	}
}







