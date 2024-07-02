package vo;

public class Person {
	private String name;	// 이름
	private String ssn;		// 주민번호
	private int age;		// 나이
	
	public Person(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", ssn: " + ssn 
				+ ", age: " + age;
	}
}
