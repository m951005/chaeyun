public class ClassEx1 {
		/*
		 * public / default / protected / private : 접근지정자 -> 없어도 동작가능
		 * class : 프로그램 실행 최소 단위
		 * 클래스의 구성 요소 (필수X)
		 * 	1. 필드(field)
		 * 	2. 생성자(constructor)
		 * 	3. 메소드(method)
		 * 
		 * 변수 : 데이터, 값, 상
		 * 메소드 : 행동, 동작
		 *
		 * 메소드 (input & output값이 없을 수 있음)
		 * 접근지정자 + [static] + 리턴타입 + 메소드명(파라미터 or 매개변수...) {
		 * 	문장...
		 * 	return 반환값;			-> 리턴타입과 동일한 타입의 값 입력
		 * }
		 */
	public static void main(String[] args) {			//void : 리턴 값이 없음
		int result = method1(0, 1);
		System.out.println("result : " + result);
		System.out.println(method2());
		System.out.println(method3(10));
		return;											//void타입일 경우 return없어도 됨. 쓸 경우 값 지정 없이도 오류X
	}
	
	public static int method1(int x, int y) {
		int result = 2 * x + 3 * y;
		return result;
	}
	
	public static String method2() {
		System.out.println("method2() 호출");
		return  "Hello World"; // return : 메소드를 호출한 곳으로 값을 돌려준다.
	}
	
	public static String method3(int a) {			//return type이 String이면 return 값이 있어야 한다.
		System.out.println("method3() 호출");
		System.out.println(a);
		if(a % 2 < 1) {
			return "짝수";							//return 을 만나면 메소드의 실행을 종료
		}
		System.out.println("method3() 종료");
		return "홀수";
	}
		
		

}
