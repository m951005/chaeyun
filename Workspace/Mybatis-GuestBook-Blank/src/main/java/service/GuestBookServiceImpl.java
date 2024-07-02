package service;

import dao.GuestBookDao;
import dao.GuestBookDaoImpl;
import exception.DuplicateMemberIdException;
import exception.IncorrectMemberInfoException;
import exception.NoSuchGuestBookException;
import vo.GuestBook;
import vo.Member;

import java.util.List;

public class GuestBookServiceImpl implements GuestBookService {

	private final GuestBookDao guestBookDao = new GuestBookDaoImpl();
	
    @Override
	public void joinMember(Member member) {
    	Member checkDupMember = guestBookDao.findMember(member.getId());
    	if(checkDupMember == null) {
    		guestBookDao.saveMember(member);
    	} else {
    		throw new DuplicateMemberIdException("중복된 아이디가있습니다.");
    	}
	}

	@Override
	public Member login(String id, String password) {
		Member member = guestBookDao.findMember(id);
		if(member != null && member.getPassword().equals(password)) {
			return member;
		} else {
			throw new IncorrectMemberInfoException("회원정보가 없거나 패스워드가 다릅니다.");
		}
	}

	@Override
	public void writeGuestBook(GuestBook guestBook) {
		guestBookDao.saveGuestBook(guestBook);
	}

	@Override
	public List<GuestBook> findGuestBooks() {
		return guestBookDao.findGuestBooks();
	}

	@Override
	public GuestBook findGuestBook(Long id) {
		GuestBook book = guestBookDao.findGuestBook(id);
		if(book != null) {
			return book;
		} else {
			throw new NoSuchGuestBookException("아이디에 해당하는 방명록이 없습니다.");
		}
	}

	@Override
	public GuestBook readGuestBook(Long id) {
		if(findGuestBook(id) != null) {
			return guestBookDao.readGuestBook(id);
		} else {
			return null;
		}
	}

	@Override
	public void updateGuestBook(GuestBook guestBook) {
		Long id = guestBook.getId();
		findGuestBook(id);
		guestBookDao.updateGuestBook(guestBook);
	}

	@Override
	public void deleteGuestBook(Long id) {
		findGuestBook(id);
		guestBookDao.removeGuestBook(id);
	}
    
}
