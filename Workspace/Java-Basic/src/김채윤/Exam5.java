package 김채윤;

public class Exam5 {

	public static void main(String[] args) {
		// 5. 1 ~ 20 사이의 정수 중 4의 배수 이거나 5의 배수인 숫자를 모두 출력하는 프로그램을 작성하세요
		
		System.out.print("1 ~ 20 사이의 정수 중 4의 배수 이거나 5의 배수 : ");
		for(int i = 1; i < 21; i++) {
			if(i % 4 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}
		}


	}

}
