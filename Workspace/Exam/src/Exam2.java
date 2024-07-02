import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
//		사용자로부터 단을 입력 받아 구구단을 출력하는 프로그램을 작성하시오.
//		단, 2단 ~ 9단 이외의 단을 입력 받으면, 단을 다시 입력 받는다.
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.print("단을 입력하세요. (0 입력 시 종료) : ");
			int dan = sc.nextInt();
			if (dan == 0) {
				flag = false;
				break;
			}
			for(int i = 1; i < 10; i++) {
				if (dan < 2 || dan > 9) {
					System.out.println("2 ~ 9단만 가능합니다. 다시 입력해 주세요.");
					break;
				}
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	}

}
