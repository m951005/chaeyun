
public class WhileEx2 {

	public static void main(String[] args) {
		/*
		 *  1 ~ 50까지의 정수 중 홀수만 모두 출력하세요. while 이용
		 *  
		 */
		int i = 1;
//		while (i < 51) {
//			if (i % 2 > 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		/*
		 * 1 ~ 10까지의 모든 정수의 합계를 구해서 출력하세요.
		 */
//		int sum = 0;
//		while (i < 11) {
//			sum += i;
//			i++;
//			// sum += i++;
//		}
//		System.out.println(sum);
		
		/*
		 * 1 ~ 100 사이의 정수 중 홀수의 합과 짝수의 합을 각각 구하여 출력하세요.
		 */
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		while (a < 101) {
			if (a % 2 > 0) {
				sum1 += a;
			} else {
				sum2 += a;
			}
			a++;
		}
		System.out.println("홀수의 합 : " + sum1 + ", 짝수의 합 : " + sum2);
		
		
	}

}
