
public class Exam1 {
	public static void main(String[] args) {
//		1부터 100사이의 정수 중 3의 배수이면서 5의 배수가 아닌 수를 출력하시오.
		for(int i = 1; i < 101; i++) {
			if (i % 3 < 1 && i % 5 > 0) {
				System.out.print(i + " ");
			}
		}
	}

}
