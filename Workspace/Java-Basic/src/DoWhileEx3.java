import java.util.Scanner;

public class DoWhileEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력 합니다.");
		while(true) {
			System.out.print("단을 입력하세요(0을 입력하면 종료) : ");
			int a = sc.nextInt();
			if (a == 0) break;
			int b = 1;
			do {
				System.out.println(a + " * " + b + " = " + a * b);
				b++;
			} while (b < 10);
		}
		System.out.println("종료합니다.");

	}

}
