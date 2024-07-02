package 김채윤;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// 3. 사용자로부터 국어, 영어, 수학 점수를 각각 입력받아 합계와 평균을 출력하는 프로그램을 작성하세요(단, 평균은 소수점 자리까지 표시)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double avg = total / 3.0;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}

}
