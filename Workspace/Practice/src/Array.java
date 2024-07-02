import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		/*
//		 * 길이가 10인 정수 배열을 선언하고 1 ~ 10까지의 값을 배열에 초기화하는 코드를 작성
//		 */
//		int[] arr1 = new int[10];
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = i + 1;
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		
//		/*
//		 * 길이가 10인 정수 배열을 선언하고 짝수에 해당하는 값을 배열에 순차적으로 초기화하는 코드를 작성
//		 */
//		int[] arr2 = new int[10];
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = (i + 1) * 2;
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
//		
//		/*
//		 * 길이가 26 인 정수 배열을 선언하고 아스키 문자 영문자(대문자)를 순차적으로 초기화하는 코드를 작성
//		 */
//		int[] arr3 = new int[26];
//		for(int i = 0; i < arr3.length; i++) {
//			arr3[i] = 65 + i;
//			System.out.print((char)arr3[i] + " ");
//		}
//		System.out.println();
//		
//		/*
//		 * 길이가 20 인 정수 배열을 선언하고 홀수에 해당하는 값을 배열에 순차적으로 초기화하는 코드를 작성
//     		단, 99 부터 역순으로 초기화 값을 저장한다.
//		 */
//		
//		int j = 99;
//		int[] arr4 = new int[20];
//		for(int i = 0; i < arr4.length; i++) {
//			arr4[i] = j;
//			System.out.print(arr4[i] + " ");
//			j-=2;
//		}
//		System.out.println();
//		
//		/*
//		 * 생성할 배열의 크기를 사용자 입력을 이용하여 생성한 후 다시 사용자 입력을 이용하여 사용자가 직접 배열의 크기만큼 초기화할 수 있도록 한다.
//    		(생성할 배열 타입은 문자열로 한다.)
//		 */
		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 크기 : ");
//		int length = sc.nextInt();
//		
//		String[] arr5 = new String[length];
//		
//		for(int i = 0; i < arr5.length; i++) {
//			System.out.print("배열의 " + (i + 1) + "번째 원소 입력 : ");
//			arr5[i] = sc.next();
//		}
//		System.out.print("생성 배열 : { ");
//		for(int i = 0; i < arr5.length; i++) {
//			System.out.print(arr5[i] + " ");
//		}
//		System.out.print("}");
		
		
		System.out.print("hello를 입력하세요.: ");
		String hello = sc.next();
		char[] arr6 = new char[5];
		for(int i = 0; i < arr6.length; i++) {
			arr6[i] = hello.charAt(i);
		}
		
		for(int i = 4; i >= 0; i--) {
			System.out.print(arr6[i] + " ");
		}
	}

}
