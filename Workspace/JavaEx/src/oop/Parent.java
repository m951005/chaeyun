package oop;

// final class 는 상속을 받을 수 없다.
public /*final*/ class Parent {
	String name = "홍길동";
	final int num = 10;
	
	public void printInfo() {
		System.out.println("Parent 클래스의 name : " + name);
	}
	
	// final 메소드는 자식클래스에서 오버라이딩을 할 수 없다.
	public final void finalMethod() {
		System.out.println("Parent 클래스의 finalMethod() 호출");
	}

}
