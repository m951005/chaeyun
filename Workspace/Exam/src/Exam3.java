
public class Exam3 {
	public static void main(String[] args) {
//	1부터 연속된 정수의 합계를 계산하여, 그 합계가 4000을 넘어가는 순간의 수를 구하여 출력하시오.
		int sum = 0;
		for(int i = 1; ;i++) {
			sum += i;
			if(sum >= 4000) {
				System.out.println(sum);
				break;
			}
		}
	}
}
