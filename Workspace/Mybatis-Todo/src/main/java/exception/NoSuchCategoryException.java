package exception;

public class NoSuchCategoryException extends RuntimeException {
    public NoSuchCategoryException() {
        super("분류 정보가 존재하지 않습니다.");
    }
}
