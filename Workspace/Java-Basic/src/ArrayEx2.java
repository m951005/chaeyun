import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 입력받아서 배열에 저장하고 배열의 합계와 평균을 구해서 출력
		 */
		int[] array = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {		//배열명.length : 배열의 길이값
			System.out.print((i+1) + "번째 정수를 입력하세요 : ");
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / array.length);		//정수를 실수로 나누면 실수로 값이 나옴

	}

}
