package exercise;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력받아 홀수인지 짝수인지 구분하여 출력하는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1보다 작은 수를 입력할 수 없습니다.");
		} else if (num % 2 > 0) {
			System.out.println(num + "는 홀수입니다.");
		} else {
			System.out.println(num + "는 짝수입니다.");
		}

	}

}
