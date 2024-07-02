package vo;

public class Staff extends Person {
	private String dept;
	
	public Staff(String name, String ssn, int age, String dept) {
		super(name, ssn, age);
		this.setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", dept: " + dept;
	}
}
