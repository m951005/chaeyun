public class OperatorEx2 {
	public static void main(String[] args) {
		// 논리연산
		int a = 3;
		int b = 5;
		System.out.println(a  + " < " +  b + " : " + (a < b));
		System.out.println(a  + " <= " +  b + " : " + (a <= b));
		System.out.println(a  + " > " +  b + " : " + (a > b));
		System.out.println(a  + " >= " +  b + " : " + (a >= b));
		
		// == : 같다
		System.out.println(a  + " == " +  b + " : " + (a == b));
		
		// != : 다르다
		System.out.println(a  + " != " +  b + " : " + (a != b));
		
		// ! : NOT(부정) 연산
		boolean c = true;
		boolean d = false;
		System.out.println("!" + c + " : " + !c);
		
		// && : AND 연산
		System.out.println(c && d);
		
		// || : OR 연산
		System.out.println(c || d);
		
		// 문제
		a = 3;
		b = 4;
		System.out.println(!(a < b) || (a > b));

	}

}
