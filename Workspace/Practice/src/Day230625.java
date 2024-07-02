import java.util.Scanner;

public class Day230625 {
	public static void main(String[] args) {
		/*
		 * 출력을 다음과 같이 나오도록 한다.
		 * 1   2   3   4   5   6   7
		 * 8   9   10  11  12  13  14
		 * 15  16  17  18  19  20  21
		 * 22  23  24  25  26  27  28
		 * 29  30  31  32  33  34  35
		 * 36  37  38  39  40  41  42
		 */
//		int num = 1;
//		for (int i = 1; i < 8; i++) {
//			for (int j = 1; j < 8; j++) {
//				System.out.print(num + "  ");
//				num++;
//			}
//			System.out.println();
//		}
//		
		/*
		 * 영문자 소문자 a ~ z 까지 출력하시오. (while문)
		 */
//		char c = 'a';
//		while(c <= 'z') {
//			System.out.print(c + ", ");
//			c++;
//		}
		
		/*
		 * 다음과 같은 형식의 출력이 나오도록 하시오. (while문)
		 * 1  2  3  4  5
		 * 6  7  8  9  10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 */
//		int num2 = 1;
//		while(num2 < 21) {
//			System.out.print(num2 + "  ");
//			if(num2 % 5 < 1) {
//				System.out.println();
//			}
//			num2++;
//		}
		
		/*
		 * 사용자가 입력한 정수값 범위에 해당하는 값만 출력하시오.
		
		최소값 : 11
		최대값 : 99
		행 수 : 10
        
        11 12 13 14 15 16 17 18 19 20
        21 22 23 24 25 26 27 28 29 30
        ...
        ...
        91 92 93 94 95 96 97 98 99
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("최소값 : ");
		int min = sc.nextInt();
		System.out.print("최대값 : ");
		int max = sc.nextInt();
		System.out.print("행 수 : ");
		int row = sc.nextInt();
		
		int count = 1;
		
		while(min <= max) {
			System.out.print(min + " ");
			if(count % row < 1) {
				System.out.println();
			}
			count++;
			min++;
		}
		
		/*
		 * 사용자로 부터 임의의 문자열을 입력받은 후
          a, e, i, o, u 문자가 얼마나 포함되어 있는지 확인하는 코드를 작성한다.
		 */
		System.out.print("Enter the text : ");
		String text = sc.next();
		
		System.out.println("a : " + countChar(text, 'a') + "ea");
		System.out.println("e : " + countChar(text, 'e') + "ea");
		System.out.println("i : " + countChar(text, 'i') + "ea");
		System.out.println("o : " + countChar(text, 'o') + "ea");
		System.out.println("u : " + countChar(text, 'u') + "ea");
		
		
		

	}
	public static int countChar(String text, char c) {
		int count1 = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == c) {
				count1++;
			}
		}
		return count1;
	}

}
