
public class ArrayEx1 {
	public static void main(String[] args) {
		/*
		 * 배열 : 동일한 타입의 데이터의 집합
		 * 배열의 선언
		 * 데이터타입[] 배열명;			-> '[]'는 배열명 뒤에도 올 수 있음
		 * 
		 * 배열의 초기
		 * 1) 배열의 선언 = {배열에 삽입할 데이터...} -> 배열의 선언과 동시에 초기화
		 * 2) 배열의 선언 = new 데이터타입[데이터의 갯수]; -> 배열을 선언만 하고, 나중에 초기값을 삽입
		 */
		
		int[] array = {10, 20, 30, 40, 50};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		// 배열의 초기값은 데에터타입의 기본값이 자동으로 삽입된다.
		// int -> 0, boolean -> false, double -> 0.0, char -> ''
		int[] array2 = new int[3];
		array2[0] = 50;
		array2[1] = 60;
		array2[2] = 70;
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
//		배열의 주소값을 넘어서 참조할 수 없다.
//		System.out.println(array2[3]); -> 에러
		
		boolean[] array3 = new boolean[2];
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		
		char[] array4 = new char[3];
		System.out.println(array4[0]);
		System.out.println(array4[1]);
		System.out.println(array4[2]);
		
	}
}
