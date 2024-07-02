package dao;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MybatisConfig;
import vo.GuestBook;
import vo.Member;

public class GuestBookDaoImpl implements GuestBookDao {

    private final SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();

	@Override
	public void saveMember(Member member) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			mapper.saveMember(member);
			sqlSession.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Member findMember(String id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			Member member = mapper.findMemberById(id);
			return member;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void saveGuestBook(GuestBook guestBook) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			mapper.saveGuestBook(guestBook);
			sqlSession.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<GuestBook> findGuestBooks() {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			List<GuestBook> books = mapper.findGuestBooks();
			return books;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public GuestBook findGuestBook(Long id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			GuestBook book = mapper.findGuestBookById(id);
			return book;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public GuestBook readGuestBook(Long id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			mapper.addGuestBookHit(id);
			GuestBook book = mapper.findGuestBookById(id);
			sqlSession.commit();
			return book;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateGuestBook(GuestBook guestBook) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			mapper.updateGuestBook(guestBook);
			sqlSession.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeGuestBook(Long id) {
		try(SqlSession sqlSession = sqlSessionFactory.openSession()){
			GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
			mapper.removeGuestBook(id);
			sqlSession.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
