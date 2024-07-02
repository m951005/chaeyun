package miniTest;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 문제3. 사용자로부터 정수를 1개 입력받아 팩토리얼 값을 구하여 출력하세요.
			(힌트) 5! = 1 * 2 * 3 * 4 * 5
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		System.out.print(num + "! = ");
		int f = 1;
		for(int i = 1; i <= num; i++) {
			f *= i;
			if(i == num) {
				System.out.print(i);
				break;
			}
			System.out.print(i + " * ");
		}
		
		System.out.println(" = " + f);
	}

}
