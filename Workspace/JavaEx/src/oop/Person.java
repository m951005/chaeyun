package oop;

public class Person {
	/*
	 * 접근 제어자(접근 지정자)
	 * - public		: 외부에서 자유롭게 접근 가능 (클래스, 필드, 메소드)
	 * - protected	: 같은 패키지 혹은 상속관계에서 접근 가능 (필드, 메소드)
	 * - (default)	: 같은 패키지 내에서 접근 가능 -> 별도로 접근 제어자를 지정하지 않았을 경우 자동으로 적용됨. 따로 표기 X
	 * - private	: 같은 클래스 내에서 접근 가능 (필드, 메소드)
	 */
	private String name;	// 이름
	private int age;		// 나이
	private String phone;	// 전화번호
	
	public Person() {}
	
	public Person(String name, int age, String phone) {
		setName(name);
		setAge(age);
		setPhone(phone);
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setName(String name) {
		if(name.length() > 10) {
			return;
		}
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 170) {
			System.out.println("나이 값이 잘못되었습니다.");
			return;
		}
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("name: " + name + ", age: " + age + ", phone : " + phone);
		
	}

}
