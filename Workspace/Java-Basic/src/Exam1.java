import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//1. 사용자로 부터 정수를 3개 입력받아 가장 큰 수와 가장 작은 수를 출력하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];

		System.out.println("세가지 정수를 입력하세요.");
		for(int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);

	}

}
