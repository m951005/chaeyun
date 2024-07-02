package miniTest;

public class Tset02 {
	public static void main(String[] args) {
		/*
		 * 문제2. 반복문과 조건문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.

			      *
			    * * *
			  * * * * *
			* * * * * * *
			  * * * * *
			    * * *
			      *
		 */
		
		for(int i = 0; i < 7; i+=2) {
			for(int j = 6; j > i; j-=2) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 7; i+=2) {
			for(int j = 0; j <= i; j+=2) {
				System.out.print("  ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
