import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건식(boolean) ? 조건식이 true인 경우 대입될 변수(데이터) : 조건식이 false인 경우 대입될 변수(데이터)
		boolean result = 3 > 2 ? true : false;
		System.out.println(result);
		
		String str = "Hello World";
		System.out.println(str);
		
		int a = 3;
		int b = 3;
		String msg = a <= b ? "참 입니다." : "거짓 입니다.";
		System.out.println(msg);
		
		//　문제
		/*
		 * 윤년 구하기
		 * 1. 년도를 4로 나누었을 때 나누어떨어지고,
		 * 		100으로 나누었을 때 나누어 떨어지지 않는다.
		 * 2. 년도를 400으로 나누었을 때 나누어 떨어진다.
		 * 위의 둘 중 하나만 만족하면 윤년이다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		String leafYear = 
				((year % 4 < 1) && (year % 100 > 0)) || year % 400 < 1 ? 
						"윤년입니다." : "윤년이 아닙니다."; 
		System.out.println(leafYear);

	}

}
