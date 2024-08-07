package dao;

import org.apache.ibatis.annotations.Param;

import vo.Member;

public interface MemberMapper {
	// 회원가입
	void saveMember(Member member);
	
	// 로그인
	Member findMemberbyIdAndPassword(@Param("id") String id,
									@Param("password") String password);
	// mybatis는 파라미터를 하나밖에 받을 수 없으므로, 2개 이상 받을 시 @Param사용. map타입을 사용할 때도 있으나 바람직한 방법은 아님
	
	void removeMember(String id);
}
