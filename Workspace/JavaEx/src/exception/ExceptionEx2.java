
package exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println("***** 프로그램 시작 *****");
		String name = null;
		String input = "홍길동";
		
		try {
			if(name.equals(input)) {					
				// equals()는 null이 아닌 객체만 참조가능. 매개변수가 null인 경우는 괜찮음
				// 그러므로 equals() 사용 시 확실하게 값을 가진 객체만 참조할 것
				System.out.println("홍길동이 맞습니다.");
			} else {
				System.out.println("홍길동이 아닙니다.");
			}
		} catch(NullPointerException ne) {
//			ne.printStackTrace();
			System.out.println(ne.getMessage());
		}
		System.out.println("***** 프로그램 종료 *****");
	}

}
