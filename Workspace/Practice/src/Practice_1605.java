import java.util.Scanner;

public class Practice_1605 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 'F';
		
		do {
			System.out.print("점수를 입력하세요. : ");
			score = scan.nextInt();
			
			if(score < 0 || score > 100) {
				System.out.println("다시 입력하세요.");
			}
		}while(score < 0 || score > 100);
		
		switch(score/10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		}
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		
	}

}
