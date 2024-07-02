package dao;

import vo.GuestBook;
import vo.Member;

import java.util.List;

public interface GuestBookDao {
    // 회원정보 저장
    public void saveMember(Member member);

    // 회원정보 검색
    public Member findMember(String id);

    // 방명록 저장
    public void saveGuestBook(GuestBook guestBook);

    // 방명록 전체 목록
    public List<GuestBook> findGuestBooks();

    // 방명록 검색
    public GuestBook findGuestBook(Long id);

    // 방명록 읽기
    public GuestBook readGuestBook(Long id);

    // 방명록 수정
    public void updateGuestBook(GuestBook guestBook);

    // 방명록 삭제
    public void removeGuestBook(Long id);
}