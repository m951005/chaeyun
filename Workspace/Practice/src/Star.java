
public class Star {

	public static void main(String[] args) {
		// 일렬
		for(int i = 1; i <= 5; i++) {
			System.out.print("*");
		}

		System.out.println();
		
		// 세로 일렬
		for(int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		System.out.println();
		
		//5행 5열
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//12345
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//54321
		for(int i = 0; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//54321 좌측정렬
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//12345 좌측정렬
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//123454321
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//543212345
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//123454321 Left-side
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//pyramid
		for(int i = 0; i < 9; i+=2) {
			for(int j = 8; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//reverse-pyramid
		for(int i = 0; i < 9; i+=2) {
			for(int j = 1; j <= i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 9; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//diamond
		for(int i = 0; i < 9; i+=2) {
			for(int j = 8; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 8; i+=2) {
			for(int j = 0; j <= i; j+=2) {
				System.out.print(" ");
			}
			for(int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//reverse-diamond
		for(int i = 1; i < 11; i+=2) {
			for(int j = 10; j >= i; j-=2) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 10; j >= i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 9; i+=2) {
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			for(int j = 8; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = -2; j < i; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
