package exception;

public class ExceptionEx4 {
	public static void main(String[] args) {
		// 예외의 강제 발생
		// 문법 : throw new (발생시킬)예외클래스의 생성자
		try {
			System.out.println("try 블록 시작");
			throw new UserException("사용자 정의 예외 발생!");
//			System.out.println("try 블록 종료");		-> 예외 강제발생으로 앞으로도 실행되지 않을 코드이므로 에러발생.
		} catch (NullPointerException ne) {
//			System.out.println("NullPointerException 발생!!");
			System.out.println(ne.getMessage());
		} catch (UserException ue) {
			System.out.println(ue.getMessage());
		}
	}
}
