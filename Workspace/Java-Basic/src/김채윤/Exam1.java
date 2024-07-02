package 김채윤;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//1. 사용자로 부터 정수를 3개 입력받아 가장 큰 수와 가장 작은 수를 출력하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		int[] array = {num1, num2, num3};
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		int min = array[0];
		for(int j = 0; j < array.length; j++) {
			if(min > array[j]) {
				min = array[j];
			}
		}
				
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		

	}

}
