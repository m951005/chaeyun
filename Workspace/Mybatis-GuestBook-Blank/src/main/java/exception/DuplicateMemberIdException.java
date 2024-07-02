package exception;

// 회원가입 시 아이디가 중복될 경우 발생하는 예외 클래스
public class DuplicateMemberIdException extends RuntimeException {
    public DuplicateMemberIdException(String message) {
        super(message);
    }
}
