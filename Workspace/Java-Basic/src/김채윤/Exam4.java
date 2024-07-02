package 김채윤;

public class Exam4 {

	public static void main(String[] args) {
		/*
		 *  4. 다음 정수의 배열 요소 중 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요
		 *  실행예시)
			배열: 1, 5, -3, 2, -6, -9, 4
			양수의 합: 12
			음수의 합:  -18
		 */
		
		int[] num = {1, 5, -3, 2, -6, -9, 4};
		int positive = 0;
		int negative = 0;
		System.out.print("배열 : ");
		for(int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < 0) {
				negative += num[i];
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > 0) {
				positive += num[i];
			}
		}
		
		System.out.println("양수의 합 : " + positive);
		System.out.println("음수의 합 : " + negative);
		
		

	}

}
