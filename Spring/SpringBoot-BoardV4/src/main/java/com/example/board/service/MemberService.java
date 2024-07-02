package com.example.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.model.member.Member;
import com.example.board.repository.MemberMapper;

import lombok.RequiredArgsConstructor;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
	private final MemberMapper memberMapper;

	public Member findMember(String member_id) {
		return memberMapper.findMember(member_id);
	}
	
	@Transactional
	public void saveMember(Member member) {
		memberMapper.saveMember(member);
	}
	
	
}