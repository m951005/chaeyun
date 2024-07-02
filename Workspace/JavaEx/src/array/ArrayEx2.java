package array;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(array[0][1]);
		System.out.println(array[2][1]);
		System.out.println(array[1][2]);
		
		String[][] strArr = new String[2][3];
		strArr[0][0] = "Hello";
		strArr[0][1] = "World";
		strArr[0][2] = "안녕하세요";
		strArr[1][0] = "제 이름은";
		strArr[1][1] = "홍길동";
		strArr[1][2] = "입니다";
		
		System.out.println("배열의 길이 : " + strArr.length);
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
		}
		
	}

}
