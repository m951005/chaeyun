package oop;
/*
 * 자바의 메모리 구조
 * 1. 메소드(Method) 영역 : static 변수를 저장하며 프로그램의 시작부터 종료까지 메모리에 남아있다.
 * 		(= class영역, static영역)
 * 2. 스택(Stack) 영역 : 지역변수, 매개변수의 값이 저장되는 공간, 
 * 						메소드가 호출될 때 메모리에 할당. 종료되면 해제(사라짐)
 * 						LIFO(Last In, First Out) 구조를 가지고 새로운 데이터가 할당되면 이전 데이터는 삭제
 * 3. 힙(Heap) 영역 : new 키워드로 생성된 객체, 배열 등 저장
 */

public class StaticEx {
	int num = 10;
	static double PI = 3.141592;
	
	public double calc1(int x, double y) {
		num = x;
		StaticEx.PI = y;							// static 메소드 사용 시에는 항상 클래스명으로 참조하기!
		return x * y;
	}
	
	public static double calc2(int x, double y) {
//		num = x;									static 메소드 안에서 non-static 필드를 참조할 수 없음
		StaticEx.PI = y;
		return x * y;
	}

	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		se.PI = 5.0;
		se.num = 15;
		System.out.println("num : " + se.num + ", PI : " + se.PI);
		
		StaticEx se2 = new StaticEx();
		System.out.println("num : " + se2.num + ", PI : " + se2.PI);		// PI값은 static 영역에 올라가 있으므로 se에서 바뀐값이 그대로 적용됨
//		System.out.println(se.num);
////		System.out.println(new StaticEx().num);		새로운 인스턴스가 생성되면서 num값 출력 후 사라짐.
//		System.out.println(se.calc1(1, 2));
//		
//		System.out.println(StaticEx.calc2(3, 2));
//		System.out.println(StaticEx.PI);			// static 영역에 올라가므로 따로 인스턴스를 생성해서 참조할 필요 X

	}

}
