import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100 사이) : ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println(score + "점은 A학점 입니다.");
		} else if (score >= 80) {
			System.out.println(score + "점은 B학점 입니다.");
		} else if (score >= 70) {
			System.out.println(score + "점은 C학점 입니다.");
		} else if (score >= 60) {
			System.out.println(score + "점은 D학점 입니다.");
		} else {
			System.out.println(score + "점은 F학점 입니다.");
		}
	}

}