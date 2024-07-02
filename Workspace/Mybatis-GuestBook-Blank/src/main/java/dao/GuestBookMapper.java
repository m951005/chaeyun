package dao;

import vo.GuestBook;
import vo.Member;

import java.util.List;

public interface GuestBookMapper {
    // 회원 가입
    void saveMember(Member member);

    // 회원정보 검색(로그인)
    Member findMemberById(String id);

    // 방명록 작성
    void saveGuestBook(GuestBook guestBook);

    // 방명록 전체 목록
    List<GuestBook> findGuestBooks();

    // 방명록 검색
    GuestBook findGuestBookById(Long id);

    // 방명록 조회수 증가
    void addGuestBookHit(Long id);

    // 방명록 수정
    void updateGuestBook(GuestBook guestBook);

    // 방명록 삭제
    void removeGuestBook(Long id);
}
