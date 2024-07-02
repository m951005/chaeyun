package oop;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round(getTotal()/3f * 100) / 100f;
	}
	
	public String info() {
		return "이름 : " + name + ", 반 : " + ban + ", 번호 : " + no
				+ ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math+ ", 총점 : "
				+ getTotal() + ", 평균 : " + getAverage();

	}
	
	
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s.info());
		

	}

}
