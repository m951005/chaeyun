import java.util.Scanner;

public class switchEx1 {

	public static void main(String[] args) {
		/*
		 * switch case문
		 * 
		 * switch (조건값) {
		 * 		case 값1:
		 * 			조건값과 값1이 일치할 경우 실행될 문장...
		 * 			break;
		 * 		case 값2:
		 * 			조건값과 값2이 일치할 경우 실행될 문장...
		 * 			break;
		 * 		case 값3:
		 * 			조건값과 값3이 일치할 경우 실행될 문장...
		 * 			break;
		 * 		...
		 * 		default:
		 * 			조건값과 case의 값이 모두 일치하지 않을 경우 실행
		 * }
		 */
		
		int a = 2;
		System.out.println("**switch문 실행**");
		switch (a) {
			case 1: 
				System.out.println("case1 입니다."); 
				break;
			case 2: 
				System.out.println("case2 입니다."); 
				break;
			case 3: 
				System.out.println("case3 입니다."); 
				break;
			default: System.out.println("일치하는 case가 없습니다.");
		}
		System.out.println("**switch문 종료**");
		
		// 문제
		/*
		 * 점수(score)를 입력받고,
		 * 그 점수가 
		 * 		90 ~ 100점이면, "A학점"
		 * 		80 ~ 89점이면, "B학점"
		 * 		70 ~ 79점이면, "C학점"
		 * 		60 ~ 69점이면, "D학점"
		 * 		60점 미만 이면, "F학점"
		 * 으로 학점을 출력하는 프로그램을 작성하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(1~100) : ");
		int score = sc.nextInt();
		char grade;
		
		switch (score / 10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println(grade + "학점 입니다.");

	}

}
