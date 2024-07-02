import java.util.*;

public class CalcEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 정수 : ");
			int a = sc.nextInt();
			System.out.print("연산자(+,-,*,/) : ");
			String op = sc.next();
			System.out.print("두 번째 정수 : ");
			int b = sc.nextInt();
		
		switch(op) {
		case "+" : System.out.println("실행 결과 : " + add(a,b)); break;
		case "-" : System.out.println("실행 결과 : " + min(a,b)); break;
		case "*" : System.out.println("실행 결과 : " + mul(a,b)); break;
		case "/" : System.out.println("실행 결과 : " + div(a,b)); break;
		default : System.out.println("연산자를 잘못 입력했습니다.");
			}
		}
		
//		int result = add(a,b);//더하기
//		System.out.println("a + b : " + result);
//		result = min(a, b);//빼기
//		System.out.println("a - b : " + result);
//		result = mul(a, b);//곱하기
//		System.out.println("a * b : " + result);
//		//나누기
//		System.out.println("a / b : " + div(a,b));
	}
	//더하기 연산을 하는 메소드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	//빼기
	public static int min(int num1, int num2) {
		return num1 - num2;
	}
	//곱하기
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	//나누기
	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}

}
