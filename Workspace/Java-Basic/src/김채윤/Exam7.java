package 김채윤;

public class Exam7 {

	public static void main(String[] args) {
		/* 7. 변수를 두 개 선언하고 값을 초기화 한 후, 두 변수의 값을 서로 바꾸어서 결과를 출력하는 프로그램을 작성하세요
		int a = 5
		int b = 3

		실행 예시)
		변경 전: a: 5, b:3
		변경 후: a:3, b:5
		*/
		
		int a = 5;
		int b = 3;
		int c = 0;
		System.out.println("변경 전 : a : " + a + ", b : "+ b);
		
		c = a;
		a = b;
		b = c;
		System.out.println("변경 후 : a : " + a + ", b : "+ b);
		
		

	}

}
