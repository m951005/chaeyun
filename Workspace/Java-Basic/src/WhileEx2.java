public class WhileEx2 {
	public static void main(String[] args) {
		int n = 1;
//		while (true) {
//			System.out.println(n++);
//			if (n > 10) {
//				break;					//반복문 안에서 break를 만나면 반복문을 빠져나온다
//			}
//		}

		int num = 10;
		while (num > 0) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
			num--;
		}
		
	}

}
