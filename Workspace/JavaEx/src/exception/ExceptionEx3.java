package exception;

public class ExceptionEx3 {
	public static void main(String[] args) {
		//ArrayIndexOutOfBoundException
		System.out.println("*** 프로그램 시작 ***");
		try {
			String[] arr = {"a", "2", "3"};
//			System.out.println(arr[3]);
//			int num = Integer.parseInt(arr[0]);
			// Integer -> Wrapper class
			// parseInt -> static method
//			System.out.println(num + 3);
			return;
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("인덱스 정보가 잘못되었습니다.");
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println(e.getMessage());
		} finally {
			// 예외발생과 상관없이 실행되어야 할 문장
			// ex) 자원회수와 관련된 문장
			System.out.println("무조건 실행되는 문장");
		}
		System.out.println("*** 프로그램 종료 ***");
	}

}
