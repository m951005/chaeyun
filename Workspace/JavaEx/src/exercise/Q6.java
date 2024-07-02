package exercise;

public class Q6 {
	public static void main(String[] args) {
		/*
		 * 다음과 같이 5행 5열의 수열을 출력하는 프로그램을 작성하세요
    	1. 중첩 반복문 사용
    	2. 실행결과
        
        ```
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
		 */
		int num = 1;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}

}
