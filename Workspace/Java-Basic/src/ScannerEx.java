import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = scan.nextInt(); // 문자열 변수 적용 시는 scan.next(); 숫자를 입력해도 문자열로 출력
		System.out.println("input : " + input);
		
	}

}
