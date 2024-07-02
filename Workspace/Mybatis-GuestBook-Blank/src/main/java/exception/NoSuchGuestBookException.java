package exception;

// 방명록 정보가 존재하지 않을 시 발생하는 예외 클래스
public class NoSuchGuestBookException extends RuntimeException {
    public NoSuchGuestBookException(String message) {
        super(message);
    }
}
