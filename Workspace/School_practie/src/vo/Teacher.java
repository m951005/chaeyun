package vo;

public class Teacher extends Person {
	private String major;
	
	public Teacher(String name, String ssn, int age, String major) {
		super(name, ssn, age);
		this.setMajor(major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", major: " + major;
	}

}
