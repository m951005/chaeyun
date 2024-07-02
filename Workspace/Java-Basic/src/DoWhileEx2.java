public class DoWhileEx2 {
	public static void main(String[] args) {
		
		int n = 1;
		int sum = 0;
		
		System.out.println("while문 이용");
		while (n < 11) {
			sum += n;
			n++;
		}
		System.out.println(sum);
		
		n = 1;
		sum = 0;
		System.out.println("do ~ while문 이용");
		do {
			sum += n;
			n++;
		}while(n < 11);
		System.out.println(sum);

	}

}
