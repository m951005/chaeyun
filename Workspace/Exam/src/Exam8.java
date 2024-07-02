import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
//		정수 5개를 입력 받아 합계를 구하시오. 단, 정수가 아닌 값이 입력되면 오류 메시지를 출력하고 다시 입력 받는다.
//		실행예시)
//		정수 입력 : 1
//		정수 입력 : 2
//		정수 입력 : a
//		정수를 입력하세요.
//		정수 입력 : b
//		정수를 입력하세요.
//		정수 입력 : 3
//		정수 입력 : 4
//		정수 입력 : x
//		정수를 입력하세요.
//		정수 입력 : 5
//		합계 : 15
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
			for(int i = 0; i < array.length; i++) {
				try {
				System.out.print("정수 입력 : ");
				array[i] = sc.nextInt();
				} catch (InputMismatchException ie) {
					System.out.println("정수를 입력하세요.");
					sc.next();
					i--;
					continue;
				}
			}
			int sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println("합계 : " + sum);

	}

}
