package 김채윤;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 2. 사용자로부터 2 이상의 정수를 입력받아 약수를 구하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 이상의 정수를 입력하세요. : ");
		int num = sc.nextInt();
		

		for(int i = 1; i <= num; i++){
			if(num < 2) {
				System.out.println("다시 입력하세요.");
				break;
			}
			if(num % i == 0){
		    	System.out.print(i + " ");
		    }
		}

	}

}
