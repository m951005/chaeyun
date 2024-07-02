import java.util.Scanner;

public class SwitchCaseEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100 사이) : ");
		int score = scan.nextInt();
		
		char grade = 'F';
		
		switch(score/10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		}
		System.out.println(grade + "학점 입니다.");
		
	}

}
