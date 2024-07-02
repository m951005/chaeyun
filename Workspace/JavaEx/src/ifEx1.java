import java.util.Scanner;

public class ifEx1 {

	public static void main(String[] args) {
		/*
		 * if문
		 * 
		 * if (조건식) {
		 * 		조건식이 true일 경우 실행될 문장(statement)...
		 * } else {
		 * 		조건식이 false일 경우 실행될 문장...
		 * }
		 * 
		 * if-else문
		 * 
		 * if (조건식1) {
		 * 		조건식1이 true일 경우 실행될 문장...
		 * } else if (조건식2){
		 * 		조건식2가 true일 경우 실행될 문장...
		 * } else {
		 * 		모든 조건식이 false일 경우 실행될 문장...
		 * }
		 * 
		 */
		
//		int a = 9;
//		System.out.println("**프로그램 시작**");
//		if (a < 10) {
//			System.out.println("a는 10보다 작다.");
//		} else {
//			System.out.println("a는 10보다 작지않다.");
//		}
//		System.out.println("**프로그램 종료**");
//		
//		if (a < 9) {
//			System.out.println("a는 9보다 작다.");
//		} else if (a > 9) {
//			System.out.println("a는 9보다 크다.");
//		} else {
//			System.out.println("a는 9와 같다.");
//			
//		}
		
		// 문제 1.
		/*
		 * 사용자로부터 하나의 정수를 입력받아서 홀수인지 짝수인지 구분하여
		 * 출력하는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		if (num % 2 > 0) {
//			System.out.println(num + "은(는) 홀수입니다.");
//		} else {
//			System.out.println(num + "은(는) 짝수입니다.");
////		}
		
		// 문제 2.
		/*
		 * 사용자로부터 3개의 정수를 입력받아, 그 중 가장 큰 숫자를
		 * 출력하는 프로그램을 작성하세요.
		 */
		System.out.print("첫번째 정수 : ");	
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");	
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");	
		int num3 = sc.nextInt();
		
		int max = num1;
		if (num1 < num2) {
			max = num2;
		} else if (num2 < num3) {
			max = num3;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");

	}

}
