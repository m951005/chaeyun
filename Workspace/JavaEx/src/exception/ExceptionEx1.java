package exception;

import java.util.*;
/*
 * 예외처리 문법
 * try {
 * 		예외가 발생 가능한 코드...
 * } catch(예외클래스 변수) {
 * 		예외가 발생(예외클래스와 맞는)했을 때 실행할 코드...
 * } finally {
 * 		예외의 발생 여부와 관계없이 무조건 실행할 문장
 * }
 */

/*
 * 자주 만나는 예외
 * - ArithmeticException : 0으로 나누려고 할 때 발생
 * - InputMismatchException : Scanner에 숫자가 아닌 문자를 입력했을 때 발생
 * - NullPointerException : null을 참조하려고 할 때 발생
 * - ArrayIndexOutOfBoundsException : 배열의 범위를 넘어서 참조하라고 할 때 발생
 * - IllegalArgumentException : 메소드의 매개변수를 잘못 넘겨줬을 때 발생
 * - NumberFormatException : 숫자형식이 아닌 문자열을 숫자로 변환하려고 할 때 발생
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("***** 프로그램 시작 *****");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("첫 번째 숫자: ");
			int a = scanner.nextInt();
			System.out.print("두 번째 숫자: ");
			int b = scanner.nextInt();
			int c = a / b;
			System.out.println(a + " / " + b + " = " + c + " 입니다.");
		} catch(ArithmeticException ae) {
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
			System.out.println(ae.getMessage());
		} catch(InputMismatchException ie) {
			System.out.println("숫자만 입력 가능합니다.");
			System.out.println(ie.getMessage());
		} finally {
//			scanner.close();
		}
		System.out.println("***** 프로그램 종료 *****");
		
//		add(a, b);

	}

}
