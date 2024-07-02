package collection;

class Apple {
	String name = "apple";
}

class Kiwi {
	String name = "kiwi";
}

class AppleBox {
	Apple apple;
	int count;
	
	public AppleBox(Apple apple, int count) {
		this.apple = apple;
		this.count = count;
	}
}

class KiwiBox {
	Kiwi kiwi;
	int count;
	
	public KiwiBox(Kiwi kiwi, int count) {
		this.kiwi = kiwi;
		this.count = count;
	}
}

// Generic 클래스 : 타입을 지정하지 않고 클래스 선언 시 사용. 객체 생성 시 타입 지정
//					기본형 타입은 X. 참조형만 사용가능하므로 기본형은 wrapper class 이용
class Box<T> {
	T obj;
	int count;
	
	public Box(T obj, int count) {
		this.obj = obj;
		this.count = count;
	}
}

public class ObjectBox {
	
	Object obj;
	int count;
	
	public ObjectBox(Object obj, int count) {
		this.obj = obj;
		this.count = count;
	}

	public static void main(String[] args) {
//		ObjectBox box1 = new ObjectBox(new Apple(), 5);
//		ObjectBox box2 = new ObjectBox(new Kiwi(), 10);
//		Kiwi apple = (Kiwi)box1.obj;			// -> ClassCastException 발생
//		Apple apple = (Apple)box1.obj;
//		Kiwi kiwi = (Kiwi)box2.obj;
//		System.out.println(apple.name);
//		System.out.println(kiwi.name);
		
		Box<Apple> box1 = new Box<>(new Apple(), 10);
		Box<Kiwi> box2 = new Box<>(new Kiwi(), 5);
		Apple apple = /*(Apple)*/box1.obj;			// 타입이 Apple로 지정되어있기 때문에 형변환 진행하지 않아도 됨.
		// Generic 클래스로 타입을 지정. 강제형변환이나 코드 입력 시 다른 타입을 입력하면 컴파일 오류 발생. 미리 Exception 방지가능
		System.out.println(apple.name);
	}

}
