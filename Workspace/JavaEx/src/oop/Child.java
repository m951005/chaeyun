package oop;

// 상속관계 정의
// 자식클래스명 + extends + 부모클래스명 {}
/*
 * 자바 상속의 특징
 * 1. 자바 클래스는 단일 상속만 가능하다.
 * 2. 상속 관계는 상대적인 개념이다.
 * 3. final 키워드가 붙은 멤버(필드, 메소드)는 재정의할 수 없다.
 */
public class Child extends Parent {
	
	// 메소드의 재정의(overriding)
	@Override		// 어노테이션 : overriding을 알려줌 -> overloading 방지
	public void printInfo() {
		System.out.println("Child 클래스의 name : " + name);
	}
	
	// 오버로딩
	public void printInfo(int n) {
		System.out.println("Child 클래스의 name : " + name);
	}
	
/* final 메소드 오버라이딩 : 불
	public void finalMethod() {
		System.out.println("Child 메소드에서 재정의한 메소드");
	}
*/	
	
	// 오버로딩은 가능
	public void finalMethod(int n) {
		System.out.println("Child 메소드에서 재정의한 메소드");
	}
	
	
	public static void main(String[] args) {
		Child ch = new Child();
//		System.out.println(ch.name);
//		ch.name = "김길동";
//		ch.printInfo();
////		ch.num = 30;			final 변수는 상수로 인식되어 변경할 수 없음
//		System.out.println((ch.num));
//		ch.printInfo();
		ch.finalMethod();
	}
	

}

class Child2 extends Child {
	int num = 20;
}
