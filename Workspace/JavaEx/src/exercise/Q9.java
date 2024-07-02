package exercise;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		/*
		 * 3개의 정수를 저장할 수 있는 배열을 만들고 사용자로 부터 정수를 입력받아 모두 출력하는 프로그램을 작성하세요
    		1. 조건1. 입력받은 정수와 동일한 값이 이미 배열에 있으면 저장하지 않고 다시 입력 받는다.
		 */
		int[] array = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 : ");
			array[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					System.err.print("중복되지 않는 값으로 재입력 : ");
					array[i] = sc.nextInt();
				}
			}
		}
		System.out.print("입력받은 정수 : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
