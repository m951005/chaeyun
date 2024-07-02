package oop;

class Banana extends Fruit {
	 public Banana() {
		 // 부모(Fruit)의 생성자 호출
//		 super();			-> 기본 생성자
		 super("바나나");		// 오버로드된 생성자
//		 new Fruit("바나나");	//	-> 새로운 객체를 생성해서 Fruit(String name)
		 System.out.println("Banana 객체 생성");
	 }
	 
	 @Override
	 public void showInfo() {
		 System.out.println("Banana class의 name : " + getName());
		 super.showInfo();
	 }
	
}
public class FruitMain {
	public static void main(String[] args) {
		Banana banana = new Banana();
		System.out.println(banana.getName());
		
		banana.showInfo();
	}

}
