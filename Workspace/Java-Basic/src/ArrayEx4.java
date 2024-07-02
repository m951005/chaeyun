
public class ArrayEx4 {
	public static void main(String[] args) {
		//2차원 배열
		int[][] array = {{1, 2, 3},{4, 5, 6}};
		System.out.println(array[0][1]);
		System.out.println(array[1][2]);
		// 4를 8로 변경하여 출력
		System.out.println("변경 전 : " + array[1][0]);
		array[1][0] = 8;
		System.out.println("변경 후 : " + array[1][0]);
		System.out.println();
		// 배열의 전체 값을 출력
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		System.out.println();
		int[][] array2 = new int[3][3];
		int num = 1;
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = num++;
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
				

	}

}
