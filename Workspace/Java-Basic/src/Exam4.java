import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		/*
		 *  4. 다음 정수의 배열 요소 중 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요
		 *  실행예시)
			배열: 1, 5, -3, 2, -6, -9, 4
			양수의 합: 12
			음수의 합: -18
		 */
		Scanner sc = new Scanner(System.in);
		
		// 배열의 길이 입력
		System.out.print("입력할 수의 개수 : ");
		int count = sc.nextInt();
		int[] array = new int[count];
		
		// 배열 요소 입력
		System.out.println("배열에 들어갈 수를 입력하시오.");
		for(int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		
		// 입력 배열 확인
		System.out.print("입력한 배열 : { ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("}");
		
		// 양수, 음수 구별 및 합계 구하기
		int positive = 0;
		int negative = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				positive += array[i];
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				negative += array[i];
			}
		}
		
		// 출력
		System.out.println("양수의 합 : " + positive);
		System.out.println("음수의 합 : " + negative);
	}

}
