package vo;

public class Student extends Person {
	private String stdNo;	// 학번
	
	public Student(String name, String ssn, int age, String stdNo) {
		super(name, ssn, age);
		this.stdNo = stdNo;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", stdNo: " + stdNo;
	}
}







