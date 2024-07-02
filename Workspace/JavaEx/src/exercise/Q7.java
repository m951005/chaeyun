package exercise;

public class Q7 {
	public static void main(String[] args) {
		/*
		 *  다음과 같이 별 모양을 출력하는 프로그램을 작성하세요
    	1. 중첩 반복문 사용
    	2. 실행결과
        
        ```
        *
        **
        ***
        ****
        *****
        
        *****
        ****
        ***
        **
        *
        ```
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
