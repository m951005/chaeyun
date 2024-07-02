package ui;

import exception.DuplicateMemberIdException;
import exception.IncorrectMemberInfoException;
import exception.NoSuchGuestBookException;
import service.GuestBookService;
import service.GuestBookServiceImpl;
import vo.GuestBook;
import vo.Member;

import java.util.List;
import java.util.Scanner;

public class GuestBookUI {

    private final GuestBookService guestBookService = new GuestBookServiceImpl();
    private Scanner scanner = new Scanner(System.in);
    private static Member loginMember;

    public GuestBookUI() {
        beforeLogin();
    }

    // 로그인 전
    public void beforeLogin() {
        while (true) {
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 프로그램 종료");
            System.out.print("> 선택: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    if (login()) {
                        afterLogin();
                    }
                    break;
                case "2":
                    joinMember();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("다시 입력 하세요");
            }
        }
    }

    // 매인매뉴
    public void afterLogin() {
        while (loginMember != null) {
            System.out.println("[방명록 프로그램]");
            System.out.println("1. 방명록 작성");
            System.out.println("2. 방명록 전체 출력");
            System.out.println("3. 방명록 읽기");
            System.out.println("4. 방명록 수정");
            System.out.println("5. 방명록 삭제");
            System.out.println("6. 로그아웃");
            System.out.print("> 선택: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1": writeGuestBook(); break;
                case "2": printGuestBooks(); break;
                case "3": readGuestBook(); break;
                case "4": updateGuestBook(); break;
                case "5": deleteGuestBook(); break;
                case "6": logout();
                default:
                    System.out.println("다시 입력 하세요");
            }
        }
    }

    // 로그인
    public boolean login() {
        System.out.println("[로그인]");
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("패스워드: ");
        String password = scanner.nextLine();
        try {
            loginMember = guestBookService.login(id, password);
            return true;
        } catch (IncorrectMemberInfoException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    // 회원가입
    public void joinMember() {
        System.out.println("[회원가입]");
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("패스워드: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        try {
            guestBookService.joinMember(new Member(id, password, name));
            System.out.println("회원가입이 완료 되었습니다.");
        } catch (DuplicateMemberIdException e) {
            System.out.println(e.getMessage());
        }
    }

    // 로그아웃
    public void logout() {
        loginMember = null;
    }

    // 방명록 작성
    public void writeGuestBook() {
        System.out.println("[방명록 등록]");
        System.out.print("내용: ");
        String contents = scanner.nextLine();
        GuestBook guestBook = new GuestBook(contents, loginMember.getId());
        guestBookService.writeGuestBook(guestBook);
        System.out.println("방명록이 등록 되었습니다.");
    }

    // 방명록 목록 출력
    public void printGuestBooks() {
        List<GuestBook> guestBooks = guestBookService.findGuestBooks();
        if (!guestBooks.isEmpty()) {
            for (GuestBook guestBook : guestBooks) {
                System.out.println(guestBook);
            }
        } else {
            System.out.println("등록된 방명록이 없습나다.");
        }
    }

    // 방명록 읽기
    public void readGuestBook() {
        System.out.println("[방명록 읽기]");
        System.out.print("아이디: ");
        Long id = new Long(scanner.nextLine());
        try {
            GuestBook readGuestBook = guestBookService.readGuestBook(id);
            System.out.println(readGuestBook);
        } catch (NoSuchGuestBookException e) {
            System.out.println(e.getMessage());
        }
    }

    // 방명록 수정
    public void updateGuestBook() {
        System.out.println("[방명록 수정]");
        System.out.print("수정할 방명록의 아이디를 입력하세요: ");
        Long id = new Long(scanner.nextLine());
        try {
            GuestBook findGuestBook = guestBookService.findGuestBook(id);
            if (findGuestBook.getMember_id().equals(loginMember.getId())) {
                System.out.println(findGuestBook);
                System.out.print("수정할 내용: ");
                String contents = scanner.nextLine();
                findGuestBook.setContents(contents);
                guestBookService.updateGuestBook(findGuestBook);
                System.out.println("방명록이 수정 되었습니다.");
            } else {
                System.out.println("본인이 작성한 방명록만 수정할 수 있습니다.");
            }
        } catch (NoSuchGuestBookException e) {
            System.out.println(e.getMessage());
        }
    }

    // 방명록 삭제
    public void deleteGuestBook() {
        System.out.println("[방명록 삭제]");
        System.out.print("삭제할 방명록의 아이디를 입력하세요: ");
        Long id = new Long(scanner.nextLine());
        try {
        	GuestBook findGuestBook = guestBookService.findGuestBook(id);
            if (findGuestBook.getMember_id().equals(loginMember.getId())) {
                guestBookService.deleteGuestBook(id);
                System.out.println("방명록이 삭제 되었습니다.");
            } else {
                System.out.println("본인이 작성한 방명록만 삭제할 수 있습니다.");
            }
        } catch (NoSuchGuestBookException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new GuestBookUI();
    }
}
