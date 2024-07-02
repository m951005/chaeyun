package oop;

public class CarMain {
	public static void main(String[] args) {
		// Car 클래스를 객체로 생성(인스턴스)
		// new 생성자명();
		Car c1 = new Car("노랑");
		System.out.println("c1 모델 : " + c1.model);
		System.out.println("c1 색깔 : " + c1.color);
		System.out.println("c1 속도 : " + c1.speed);
		
		Car c2 = new Car("파랑");
		System.out.println("c2 모델 : " + c2.model);
		System.out.println("c2 색깔 : " + c2.color);
		System.out.println("c2 속도 : " + c2.speed);
		
		System.out.println();
		System.out.println("***c1과 c2 변경 후 정보***");
		c2.color = "빨강";
		c2.speed = 150;
		System.out.println("c1 모델 : " + c1.model);
		System.out.println("c1 색깔 : " + c1.color);
		System.out.println("c1 속도 : " + c1.speed);
		System.out.println("c2 모델 : " + c2.model);
		System.out.println("c2 색깔 : " + c2.color);
		System.out.println("c2 속도 : " + c2.speed);
		
//		System.out.println(new Car().model);
		c1 = c2;
		System.out.println("***c1 = c2 코드 실행 후 정보***");
		System.out.println("c1 모델 : " + c1.model);
		System.out.println("c1 색깔 : " + c1.color);
		System.out.println("c1 속도 : " + c1.speed);
		System.out.println("c2 모델 : " + c2.model);
		System.out.println("c2 색깔 : " + c2.color);
		System.out.println("c2 속도 : " + c2.speed);
		
		System.out.println();
		System.out.println("***speedUp 메소드 호출***");
		c1.speedUp(50);
		System.out.println("c1 속도 : " + c1.speed);
		System.out.println("c2 속도 : " + c2.speed);
		
		System.out.println();
		System.out.println("***speeDown 메소드 호출***");
		c2.speedDown(20);
		System.out.println("c1 속도 : " + c1.speed);
		System.out.println("c2 속도 : " + c2.speed);
		
		System.out.println();
		System.out.println("***colorChange 메소드 호출***");
		String color = c1.colorChange("노랑");
		System.out.println("c1 색깔 : " + color);
		System.out.println("c2 색깔 : " + color);
		
	}

}
