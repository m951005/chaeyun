package vo;
/*
 * vo : 객체의 정보를 저장하고 있는 PKG
	- Person(부모) : name, son, age
	- Student(자식) : stdNo
	- Teacher(자식) : major
	- Staff(자식) : dept
 */

public class Person {
	private String name;		//	이름
	private String ssn;			//	주민번호
	private int age;			//	나이
	
	public Person(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	// name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// ssn
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override					// toString() -> object 내 메소드를 오버라이딩
	public String toString() {
		return "name: " + name + ", ssn: " + ssn 
				+ ", age: " + age;
	}

}
