import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
//		서로 다른 숫자 10개가 들어있는 int형 배열을 만든 뒤, 사용자에게 10 이하의 자연수 2개를 입력받고 해당하는 인덱스에 있는 배열의 원소를 교환하고 출력하시오.
//		(실행 예시)
//		Original : 10 20 30 40 50 60 70 80 90 100
//		변경하고 싶은 위치1을 입력하세요
//		1
//		변경하고 싶은 위치2를 입력하세요
//		10
//		New : 100 20 30 40 50 60 70 80 90 10
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Original : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("변경하고 싶은 위치1을 입력하세요. : ");
		int index1 = sc.nextInt() - 1;
		System.out.print("변경하고 싶은 위치2을 입력하세요. : ");
		int index2 = sc.nextInt() - 1;
		if((index1 < 1 || index1 > 10) && (index2 < 1 || index2 > 10)) {
			System.out.println("다시 입력해주세요.");
		}
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		System.out.print("New : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
