import java.util.*;

public class Exam7 {
	public static void main(String[] args) {
//		ArrayList에 숫자를 5개 입력받아 저장한 후 정렬하여 오름차순으로 정렬하여 출력하시오.
//		실행예시)
//		숫자 입력 1: 4
//		숫자 입력 2: 6
//		숫자 입력 3: 1
//		숫자 입력 4: 7
//		숫자 입력 5: 8
//		오름차순 정렬 : 1 4 6 7 8
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자 입력 " + (i + 1) + ": ");
			list.add(i, sc.nextInt());
		}
		list.sort(Comparator.naturalOrder());
		System.out.print("오름차순 정렬 : ");
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

}
