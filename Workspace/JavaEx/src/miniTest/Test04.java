package miniTest;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[3];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번 정수를 입력하세요. : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("입력받은 정수 : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);

	}

}
