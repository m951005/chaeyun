public class FormatedPrint {
	public static void main(String[] args) {
		int a = 12345;
		System.out.println("a : " + a);
		System.out.printf("a : %d\n", a);//정수 출력 시 %d
		System.out.printf("a : %7d\n", a);
		double d = 3.141592;
		System.out.println("d : " + d);
		System.out.printf("d : %f\n", d); //실수 출력 시 %f
		System.out.printf("d : %.3f\n", d); //소수점 3자리까지 출력 (반올림적용)
		System.out.printf("d : %5.2f\n", d); //총 5자리, 소수점 2자리까지 출력(소수점도 자리수에 포함)
		String s = "HelloWorld"; // String은 참조형타입
		System.out.println("s : " + s);
		System.out.printf("s : %s\n", s); //문자열 출력 시 %s
		System.out.printf("s : %12s %d %f", s, 3, 1.0);
		
		
	}

}
