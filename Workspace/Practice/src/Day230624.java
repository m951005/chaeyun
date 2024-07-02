import java.util.*;

public class Day230624 {
	public static void main(String[] args) {
		/*
		 * 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 출력하는 코드를 작성한다.
		 * 단, 1 부터 시작하는 값이 아닌 100 부터 시작하는 형태로 나오게 한다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		for (int i = 1; i <= num1; i++) {
			System.out.print((i + 99) + " ");
		}
		
		/*
		 * 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 누적하여 합을 구하는 코드를 작성한다.
		 */
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num2; i++) {
			sum += i;
		}
		System.out.print("누적 합 : " + sum);
		
		/*
		 * 정수값을 입력받을 때 지정된 범위의 입력값이 아닌 경우 최대 3번 다시 입력 받을 수 있도록 하는 코드를 작성한다.
		 * (지정된 범위는 1 ~ 100 사이의 값이다.)
		 */
			System.out.print("정수 입력 : ");
			int num3 = scan.nextInt();
			for(int i = 1; i < 4 ; i++) {
			if(num3 > 0 && num3 < 101) {
				System.out.println("완료");
				break;
			} else if(i == 3) {
				System.out.println("더 이상 입력이 불가합니다.");
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		/*
		 * 사용자가 입력한 문자열을 기반으로 파일명이 자동으로 생성되는 프로그램을 만들려고 한다. 
		 * 다음의 요구 사항을 파악하여 사용자가 원하는 기능이 동작하도록 코드를 작성하시오.
		 * 1. 임의의 파일명을 입력할 수 있어야 한다.
		 * 2. 파일은 1개를 생성할 수도 있지만 원하는 경우 2개 이상도 생성할 수 있다.
		 * 3. 만약 2개 이상의 파일을 생성하는 경우 2번째 파일 부터는 파일명 뒤에 "[2]" 접미사가 붙는다.
		 * 4. 3번 요구사항의 접미사 숫자값은 2 로 고정하는 것이 아니라 파일 수에 맞추어 1씩 증가해야 한다.
		 */
		System.out.print("파일명 입력 : ");
		String name = scan.next();
		System.out.print("생성 파일 수 : ");
		int file = scan.nextInt();
		System.out.println("결과");
		for(int i = 1; i <= file; i++) {
			if(i == 1) {
				System.out.println("'" + name + "'" + " 생성 완료!");
			} else {
				System.out.println("'" + name + "[" + i + "]" + "'" + " 생성 완료!");
			}
		}
		

	}

}
