package exercise;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		/*
		 * char 타입의 변수에 임의의 알파벳을 대입하고 알파벳이 대문자인지 소문자인지 구분하여 출력하는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		char alpha = sc.next().charAt(0);
		if (alpha >= 'a' && alpha <= 'z') {
			System.out.println(alpha + "는 소문자 입니다.");
		} else if (alpha >= 'A' && alpha <= 'Z') {
			System.out.println(alpha + "는 대문자 입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}

	}

}
