import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 50 사이의 정수 중 3의 배수만 출력하세요. for문 이용
		 */
		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		/*
		 * 사용자로부터 단을 입력받아 구구단을 출력하는 프로그램을 작성하세요.
		 * ex) 단을 입력하세요: 5
		 * 5 * 1 = 5
		 * 5 * 2 = 10
		 * ...
		 * 5 * 9 = 45
		 */
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요: ");
//		int dan = sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
		
		/*
		 * 정수 2개를 입력받아 for문을 사용하여 그 사이의 모든 정수의 합계를 구하시오.
		 * (단, 입력받은 2개의 정수 합계에 포함)
		 * (더 큰 수가 먼저 입력돼도 같은 계산 결과가 나오도록 한다.)
		 */
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		if (num1 > num2) {
			sum = num1;
			num1 = num2;
			num2 = sum;
		}
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println(num1 + " ~ " + num2 + " 까지의 합계 : " + sum);
		

	}

}
