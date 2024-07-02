package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MybatisConfig;
import vo.Member;

public class MemberDaoMybatis implements MemberDao {
	
	private final SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();

	@Override
	public Member saveMember(Member member) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			int result = mapper.saveMember(member);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public Member findMemberById(Long id) {
		SqlSession sqlSession = null;
		Member member = null;
		try {
			// SqlSessionFactory에 SqlSession 객체를 얻는다.
			sqlSession = sqlSessionFactory.openSession();
			// SqlSession과 Mapper 인터페이스를 연결한다.
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			member = mapper.findMemberById(id);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) sqlSession.close();
		}
		
		return member;
	}

	@Override
	public List<Member> findMembers() {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			List<Member> members = mapper.findMembers();
			return members;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Member updateMember(Member member) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			mapper.updateMember(member);
			sqlSession.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public void removeMember(Long id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			mapper.removeMember(id);
			sqlSession.commit();
			if(id == null) {
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
