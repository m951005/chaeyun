package array;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		/*
		 * 배열의 정의 : 동일한 타입의 데이터의 집합
		 * 
		 * 배열의 선언
		 * 	1. 데이터타입[] 변수명 = 초기값
		 * 	2. 데이터타입[] 변수명 = new 데이터타입[갯수]
		 * 
		 * 배열의 초기화
		 * 	1. 배열의 선언과 동시에 초기화
		 * 	2. 배열을 생성하고 나중에 초기화
		 */
		int[] num = {1, 2, 3, 4, 5};
		System.out.println(num);
		System.out.println(num[0]);
		
		int[] array = new int[5];			// index 0 ~ 4
		System.out.println(array[0]);		//'0'출력 = null값
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		System.out.println(array[2]);
		for (int i = 0; i < 5; i++) {
			System.out.println("array[" + i +"] : " + array[i]);
		}
		
		boolean[] array2 = new boolean[2];
		System.out.println(array2[0]);		//'false'출력
		
		String[] array3 = new String[3];
		System.out.println(array3[0]);		//'null'출력
		
		/*
		 * 실습문제
		 * 사용자로부터 3개의 점수를 입력받아, 그 합계와 평균을 구하는 프로그램을 작성하세요.
		 * (배열 사용)
		 */
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "번 째 점수를 입력하세요. : ");
			score[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < 3; i++) {
			total += score[i];
		}
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + total / 3.0);
				
		
	}

}
