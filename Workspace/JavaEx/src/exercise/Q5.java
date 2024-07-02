package exercise;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		/*
		 * 양의 정수를 입력받아 1 부터 입력받은 양의 정수 사이의 모든 정수의 합을 구하여 출력하는 프로그램을 작성하세요
    	1. 실행결과
        
        ```
        양의 정수를 입력하세요 : 10
        1 ~ 10 까지의 합은 55 입니다.
        ```
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
//		if(num < 0) {
//			System.out.println("다시 입력하시오.");
//		} else {
//			for(int i = 1; i <= num; i++) {
//				sum += i;
//			}
//			System.out.println("1 ~ " + num + "까지의 합은 " + sum + "입니다.");
//		}
		
//		while문 사용
		while(num > 0) {
			sum += num;
			num--;
		}
		System.out.println("1 ~ " + num + "까지의 합은 " + sum + "입니다.");
		

	}

}
