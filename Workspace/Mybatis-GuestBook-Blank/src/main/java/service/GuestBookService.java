package service;

import vo.GuestBook;
import vo.Member;

import java.util.List;

public interface GuestBookService {
    // 회원가입
    void joinMember(Member member);
    // 회원정보 검색(로그인)
    Member login(String id, String password);
    // 방명록 등록
    void writeGuestBook(GuestBook guestBook);
    // 방명록 전체 검색
    List<GuestBook> findGuestBooks();
    // 방명록 찾기
    GuestBook findGuestBook(Long id);
    // 방명록 읽기
    GuestBook readGuestBook(Long id);
    // 방명록 수정
    void updateGuestBook(GuestBook guestBook);
    // 방명록 삭제
    void deleteGuestBook(Long id);
}
