package exercise;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		/*
		 * 키보드로부터 연산자와 정수 2개를 입력받아 계산하여 결과를 출력하는 프로그램을 작성하세요
    1. 조건1. switch~case문 사용
    2. 조건2. 연산자를 먼저 입력받고, 그 후에 정수 2개를 입력 받는다.
    3. 조건3. 연산자는 +, -, *, / 4개의 산술연산자 중 하나를 받는다.
    4. 실행결과
        
        ```
        연산자 (+,-,*,/) : +
        첫번째 정수 : 2
        두번째 정수 : 4
        2+4 = 6
        
        연산자 (+,-,*,/) : *
        첫번째 정수 : 5
        두번째 정수 : 6
        5*6 = 30
        ```
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 (+,-,*,/) : ");
		String oper = sc.next(); // char oper = sc.next().charAt(0);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		switch (oper) {
			case"+" :
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case"-" : 
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case"*" :
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case"/" :
				System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2));
				break;
			default : 
				System.err.println("연산자를 잘못 입력하셨습니다.");
		}

	}

}
