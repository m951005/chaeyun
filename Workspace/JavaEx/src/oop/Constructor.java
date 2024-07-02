package oop;

class Apple {
	//생성자
	/*
	 * 생성자의 종류
	 * 1. 명시적 생성자 : 프로그래머가 클래스의 생성자를 정의한 것
	 * 2. 묵시적(기본) 생성자 : 클래스에 생성자를 정의하지 않고 컴파일 시점에 자동으로 만들어진 것
	 * 
	 * 생성자의 사용목적
	 * : 클래스를 객체로 생성할 때 필드값을 초기화 혹은
	 *	객체 생성시 초기 작업을 지정하기 위해서 사용
	 *
	 * 여러개의 생성자를 정의할 때, 주의할 점 -> 생성자의 오버로딩(overloading)****
	 * : 생성자의 매개변수(파라미터)의 개수, 타입, 순서 등을 다르게해서 정의해야한다.
	 * 
	 * 생성자 안에서의 this()
	 * : 같은 클래스 내의 다른 생성자를 호출
	 * 		* this() 문장은 생성자 첫 라인에 실행되어야 한다.
	 * 
	 * 생성자 안에서의 this
	 * : 같은 클래스 내의 필드를 호출
	 */
	String brand;		// 품종 			//	지역변수는 선언 시 초기값을 줘야하나 전역변수(필드)는 초기값을 주지 않아도 기본값이 세팅됨.
	int radius;			// 크기	
	
	public Apple() {
		System.out.println("Apple 객체 생성자 1");
	}
	
	public Apple(String brand) {
		this.brand = brand;
		System.out.println("Apple 객체 생성자 2");
	}
	
	public Apple(int radius) {
		this.radius = radius;
		System.out.println("Apple 객체 생성자 3");
	}
	
	public Apple(String brand, int radius) {
//		brand = b;
		this(brand);
		this.radius = radius;
//		this(r);		-> 생성자 내 생성자호출은 한번만 가능
		System.out.println("Apple 객체 생성자 4");
	}
	
	public void info() {
		System.out.println("brand : " + brand + ", radius : " + radius);
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		// Apple 클래스의 객체 생성
		Apple apple = new Apple("아오리", 5);
		apple.info();
		Apple apple2 = new Apple("홍로");
		apple2.info();
		Apple apple3 = new Apple();
		apple3.info();
		Apple apple4 = new Apple(5);
		apple4.info();

	}

}
