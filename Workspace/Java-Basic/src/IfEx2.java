import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요. : ");
		int year = scan.nextInt();
		System.out.println("Year : " + year);
		
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.print(year + "년은 윤년입니다.");
		} else if (year % 400 == 0) {
			System.out.print(year + "년은 윤년입니다.");
		} else {
			System.out.print(year + "년은 윤년이 아닙니다.");
		}
		
//		if ((year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0) {
//			System.out.println("입력하신 연도는 윤년입니다.");
//		}else {
//			System.out.println("입력하신 연도는 윤년이 아닙니다.");
//		}
	}

}
