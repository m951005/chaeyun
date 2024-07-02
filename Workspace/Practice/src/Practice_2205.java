import java.util.Scanner;

public class Practice_2205 {
	public static void main(String[] args) {
		
		//배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i < arr.length; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		/*
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		 *  ★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		
		for(int i = 0; i <= 7; i++) {
			for(int j = i; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		 * 	★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		
		for(int i = 7; i >= 0; i--) {
			for(int j = i; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//num 배열에 저장된 요소의 최대값을 출력하시오
		
		int[] num = {10, 20, 50, 40, 25};
		int max = num[0];
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
		
		//num2 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num2 = {2, 3, 10, 7, 8, 21};
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < num2.length; i++) {
			if(num2[i] % 2 == 0) {
				sum1 += num2[i];
			}else {
				sum2 += num2[i];
				
			}
		}
		System.out.println("짝수의 합 : " + sum1 + ", 홀수의 합 : " + sum2);
		

	}

}
