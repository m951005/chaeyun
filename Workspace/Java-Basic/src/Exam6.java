
public class Exam6 {

	public static void main(String[] args) {
		/*
		 *  6. 다음과 같은 결과가 출력되도록 반복문을 이용하여 프로그램을 작성하세요
		 *  실행예시)
		 	*
		 	**
		 	***
		 	****
		 	*****
		 	****
		 	***
		 	**
			*
		 */
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
