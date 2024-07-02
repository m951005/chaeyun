
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 형 변환 (Casting)
		 * 1. 자동(묵시적) 형 변환
		 * 		byte -> short -> int -> long -> float
		 * 2. 강제(명시적) 형 변환
		 */
//		System.out.println(true + 'A');
		byte a = 2;
		short b = 3;
		// int 보다 작은 정수형 타입은 int로 자동으로 바꾼다. -> 자동 형 변환
		int c = a + b;
		System.out.println(a + b);
		
		byte b1 = 4;
		byte b2 = 3;		// int로 자동 형변환됨.
		int b3 = b1 + b2;	// b2가 int로 자동 형 변환되어있어 byte타입에 담기지 않음.
		
		float f = 1.2F;
		long num = 10L;
		f = num;
		System.out.println(f);
		
		// char는 자바 내부적으로는 숫자로 취급
		char ch1 = 'A';
		int num1 = ch1;
		System.out.println(num1);
		
		short num2 = 3;
		byte num3 = (byte)num2;		//강제 형 변환
		System.out.println(num3);
		
		int num4 = 98;
		System.out.println((char)num4);
		

	}

}
