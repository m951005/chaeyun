package oop;

class Radio extends Controller {

	@Override
	public void volumeUp() {
		System.out.println("Radio volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Radio volume down");
		
	}
}

//	추상화 : 추상메소드를 가진 클래스를 미완상태로 만들어 해당 클래스를 상속받는 클래스 내에서 재정의(오버라이드)하여 메소드를 규격화할 수 있음.
public abstract class Controller {
	public void turnOn() {
		System.out.println("Power on");
	}
	
	public void turnOff() {
		System.out.println("Power Off");
	}
	
	// abstract method(추상메소드) : 추상 클래스는 추상 메소드를 꼭 하나 이상 가져야함.
	//							클래스와 메소드 앞에 모두 abstract 키워드 붙어야 함
	public abstract void volumeUp();
	public abstract void volumeDown();

	public static void main(String[] args) {
		Controller c = new Radio();
		//	추상 클래스는 직접 객체를 생성할 수는 없으나, 상속받은 자식 클래스의 객체는 생성가능.
		//그러나 타입은 추상클래스의 타입으로 사용 가능. (부모클래스 > 자식클래스)
		c.turnOn();
		c.turnOff();
		Radio radio = new Radio();
		radio.turnOn();
		radio.turnOff();
		radio.volumeUp();
		radio.volumeDown();
	}
}
