import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
//		사용자에게서 학생 5명에 대한 시험 점수를 입력 받아서 5명의 평균 점수를 구하고 평균
//		점수 이상인 학생이 몇 명인지 출력하시오.
//		실행예시)
//		학생 1의 점수를 입력하시오
//		1
//		학생 2의 점수를 입력하시오
//		2
//		학생 3의 점수를 입력하시오
//		3
//		학생 4의 점수를 입력하시오
//		4
//		학생 5의 점수를 입력하시오
//		5
//		평균점수 이상인 학생의 수는 3명 입니다.
			Scanner sc = new Scanner(System.in);
			int[] grade = new int[5];
			for(int i = 0; i < grade.length; i++) {
				System.out.print("학생" + (i + 1) + " 의 점수를 입력하시오. : ");
				grade[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i = 0; i < grade.length; i++) {
				sum += grade[i];
			}
			double avg = sum / 5.0;
			
			int count = 0;
			for(int i = 0; i < grade.length; i++) {
				if(grade[i] >= avg) {
					count++;
				}
			}
			
			System.out.println("평균점수 이상인 학생의 수는 " + count + "명 입니다.");
		
	}

}
