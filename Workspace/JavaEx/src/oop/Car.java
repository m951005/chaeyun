package oop;

public class Car {
	// 변수의 종류 : 전역변수, 지역변수, 클래스변수(static 변수)
	// 속성 - > 필드(field) = 멤버변수 -> 전역변수
	String model;	// 차종
	String color;	// 색깔
	int speed;		// 속도
	
	/*
	public void ex() {
		speed = 10;			// 전역변수
		int speed = 10;		// 지역변수
		
	}
	*/
	
	// 생성자(constructor)
	public Car(String c) {
		color = c;
	}
	
	// 행동 -> 메소드(method)
	/* public */ void speedUp(int range) {		// 메소드 명은 의미있는 단어들로 조합
		speed += range;
	}
	
	public void speedDown(int range) {
		speed -= range;
	}
	
	int addCal(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public String colorChange(String change) {
		color = change;
		return color;
	}
	
	public static void main(String[] args) {
		int val1 = 15;
		int val2 = 39;
		
		Car car1 = new Car("빨강");
		int sum = car1.addCal(val1, val2);
		System.out.println(sum);
	}
	
}
