package miniTest;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 문제1 . 사용자로부터 국어, 영어, 수학 점수를 정수로 입력 받아 총점과 평균을 계산하여 출력하세요.
 			단 평균은 소수점 이하 자리까지 포함하여 출력하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
