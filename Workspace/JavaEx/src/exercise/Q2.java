package exercise;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		/*
		 * 근무시간을 입력받아 급여를 계산하여 출력하느 프로그램을 작성하세요.
		 * 1. 조건1. 50시간 까지의 급여는 10,000원 이다.
		 * 2. 조건2. 50시간을 초과한 금액에 대해서는 10%를 더 지급한다.
		 * 3. 실행결과
		 * 근무시간을 입력 하세요 : 60
		 * 급여는 610000원 입니다.
		 */
		int hourPay = 10000;
		int pay = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간을 입력 하세요 : ");
		int time = sc.nextInt();
		
		if (time < 51) {
			pay = hourPay * time;
		} else {
			pay = (int)(50 * hourPay + (time - 50) * hourPay * 1.1);
		}
		System.out.println("급여는 " + pay + "원 입니다.");

	}

}
