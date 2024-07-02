package oop;

public class Fruit {
	private String name;
	
	public Fruit() {
		System.out.println("Fruit 기본 생성자 호출");
	}
	
	public Fruit(String name) {
		this.name = name;
		System.out.println("name을 받는 Fruit 생성자 호출");
	}
	
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("Fruit class name : " + name);
	}

}

