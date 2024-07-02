
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 형 변환 : 데이터타입을 다른 타입으로 변환하는 것
		 * 1) 자동 형 변환 : 작은 타입 데이터 -> 큰 타입 데이터. 자동으로 변환됨. 별도 표기X
		 * 2) 강제 형 변환 : 큰 타입 데이터 -> 작은 타입 데이터. 강제로 변환함. 
		 * 	정수(byte -> short / char -> int -> long) -> 실수(float -> double)
		 * 	정수에서 실수로 변환은 바이트 크기와 상관없이 가능. 실수 -> 정수는 불가
		 */
		int a = 10;
		System.out.println(a);
		double b = a;
		System.out.println(b);
		
		b = 3.1;
		a = (int)b;
		System.out.println(a);
		
		long c = 100l;
		float d = c;
		System.out.println(d);
		
		char f = 'A';
		double g = f;
		System.out.println(f);
		System.out.println((int)f);
		System.out.println((char)65);
		System.out.println((char)('A'+1));
		System.out.println(g);

	}

}
