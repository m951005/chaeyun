import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("구구단 단을 입력하세요. ('0' 입력 시 종료) : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			
			}
		}

	}

}
