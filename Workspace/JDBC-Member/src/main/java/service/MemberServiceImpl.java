package service;

import java.util.List;

import dao.*;
import vo.Member;

public class MemberServiceImpl implements MemberService {
	
	private final MemberDao memberDao;
	
	public MemberServiceImpl() {
		memberDao = new MemberDaoJDBC();
	}

	@Override
	public Member saveMember(Member member) {
		return memberDao.saveMember(member);
	}

	@Override
	public Member findMemberById(Long id) {
		return memberDao.findMemberById(id);
	}

	@Override
	public List<Member> findMembers() {
		return memberDao.findMembers();
	}

	@Override
	public Member updateMember(Member member) {
		return memberDao.updateMember(member);
	}

	@Override
	public void removeMember(Long id) {
		memberDao.removeMember(id);
	}

}
