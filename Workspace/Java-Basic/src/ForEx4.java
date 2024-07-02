
public class ForEx4 {
	public static void main(String[] args) {
		/*
		 * Q.1 ~ 100사이의 정수 중 2의 배수이면서 3의 배수가 아닌 정수의 합계(for문 이용)
		 */
		
		int sum = 0;
		for(int i  = 1; i <= 100; i++) {
			if(i%2==0&&i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
