
public class Exam5 {

	public static void main(String[] args) {
		// 5. 1 ~ 20 사이의 정수 중 4의 배수 이거나 5의 배수인 숫자를 모두 출력하는 프로그램을 작성하세요
		
		for(int i = 1; i < 21; i++) {
			if(i % 4 < 1 || i % 5 < 1) {
				System.out.print(i + " ");
			}
		}
	}

}
