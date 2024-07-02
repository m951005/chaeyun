import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
//		두 수와 연산자를 입력 받아 계산하는 프로그램을 작성하시오.
//		(실행 예시)
//		첫번째 수 입력 : 50
//		연산자(+, -, *, /, %) 입력 : *
//		두번째 수 입력 : 22
//		50 * 22 = 1100
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String s = null;
		
		try {
			System.out.print("첫번째 수 입력 : ");
			num1 = sc.nextInt();
			System.out.print("연산자(+, -, *, /, %) 입력 : ");
			s = sc.next();
			System.out.print("두번째 수 입력 : ");
			num2 = sc.nextInt();
			switch(s) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": if(num1 == 0 || num2 == 0) {
				throw new ArithmeticException();
			}
			result = num1 / num2; break;
			case "%": 
				if(num1 == 0 || num2 == 0) {
					throw new ArithmeticException();
				}
				result = num1 % num2; break;
			default : System.out.println("다시 입력해주세요.");
			}
			System.out.println(num1 + " " + s + " " + num2 + " = " + result);
		} catch(InputMismatchException ie) {
			System.out.println("정수로 입력해 주세요.");
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
}
