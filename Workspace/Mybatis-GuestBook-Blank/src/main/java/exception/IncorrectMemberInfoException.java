package exception;

// 로그인 시 아이디 패스워드 정보 불일치 할 경우 발생하는 예외 클래스
public class IncorrectMemberInfoException extends RuntimeException {
    public IncorrectMemberInfoException(String message) {
        super(message);
    }
}
