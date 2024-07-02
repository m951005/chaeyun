package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MybatisConfig;
import vo.Member;

public class MemberDao {
	
	private SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();
	
	// 회원가입
	public void saveMember(Member member) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			mapper.saveMember(member);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	public Member findMemberbyIdAndPassword(String id, String password) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			return mapper.findMemberbyIdAndPassword(id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		// 회원가입
//		Member member1 = new Member("user1", "1234", "유저1");
//		Member member2 = new Member("user2", "1234", "유저2");
//		Member member3 = new Member("user3", "1234", "유저3");
//		
//		dao.saveMember(member1);
//		dao.saveMember(member2);
//		dao.saveMember(member3);
		
		// 로그인
		Member findMember = dao.findMemberbyIdAndPassword("user1", "1234");
		System.out.println("findMember: " + findMember);
	}
}
