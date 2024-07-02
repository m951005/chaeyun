package exception;

public class NoSuchTaskException extends RuntimeException {
    public NoSuchTaskException() {
        super("할 일 정보가 존재하지 않습니다.");
    }
}
