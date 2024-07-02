package ui;

import java.util.*;

import manager.SchoolManager;
import vo.*;

// SchoolUI : 사용자가 인터렉션(입,출력) 역할을 하는 클래스
public class SchoolUI {
	private Scanner sc = new Scanner(System.in);
	private SchoolManager manager = new SchoolManager();
	
	public SchoolUI() {
		boolean flag = true;
		while (flag) {
			showMain();
			int input = sc.nextInt();
			switch (input) {
				case 1: addPerson(); break;
				case 2: findPerson(); break;
				case 3: updatePerson(); break;
				case 4: removePerson(); break;
				case 5: showAllPersons(); break;
				case 6: flag = false; break;
				default: System.out.println("다시 입력해 주세요");
			}
		}
		System.out.println("프로그램을 종료 합니다.");
	}
	
	public void showMain() {
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 전체출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택> ");
	}
	// 등록하기
	public void addPerson() {
		System.out.println("1. 학생등록");
		System.out.println("2. 교사등록");
		System.out.println("3. 직원등록");
		System.out.print("선택: ");
		int input = sc.nextInt();
		
		if (input > 0 && input < 4) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("주민번호: ");
			String ssn = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			Person p;
			
			// 작성
			switch(input) {
				case 1:
					System.out.print("학번: ");
					String stdNo = sc.next();
					p = new Student(name, ssn, age, stdNo);
					if(manager.addPerson(p) != null) {
						System.out.println("등록되었습니다.");
					} else {
						System.out.println("주민번호가 중복입니다.");
					}
					break;
				case 2:
					System.out.print("전공과목: ");
					String major = sc.next();
					p = new Teacher(name, ssn, age, major);
					if(manager.addPerson(p) != null) {
						System.out.println("등록되었습니다.");
					} else {
						System.out.println("주민번호가 중복입니다.");
					}
					break;
				case 3:
					System.out.print("부서정보: ");
					String dept = sc.next();
					p = new Staff(name, ssn, age, dept);
					if(manager.addPerson(p) != null) {
						System.out.println("등록되었습니다.");
					} else {
						System.out.println("주민번호가 중복입니다.");
					}
					break;
			}
			
		} else {
			System.out.println("잘못 입력 했습니다.");
		}
	}
	
	// 검색하기
	public void findPerson() {
		System.out.print("주민번호: ");
		String ssn = sc.next();
		if(manager.findPerson(ssn) != null) {
			System.out.println(manager.findPerson(ssn));
		} else {
			System.out.println("검색된 정보가 없습니다.");
		}
	}
	
	// 수정하기
	public void updatePerson() {
		System.out.print("주민번호: ");
		String ssn = sc.next();
		Person person = manager.findPerson(ssn);
		if(manager.findPerson(ssn) != null) {
			System.out.println(manager.findPerson(ssn).toString());
			System.out.print("수정할 이름: ");
			String name = sc.next();
			person.setName(name);
			System.out.print("수정할 나이: ");
			int age = sc.nextInt();
			person.setAge(age);
		} else {
			System.out.println("검색된 정보가 없습니다.");
		}
		
		
		if(person instanceof Student) {
			System.out.print("수정할 학번: ");
			String stdNo = sc.next();
			((Student) person).setStdNo(stdNo);
		} else if (person instanceof Teacher) {
			System.out.print("수정할 전공과목: ");
			String major = sc.next();
			((Teacher) person).setMajor(major);
		} else {
			System.out.print("수정할 부서정보: ");
			String dept = sc.next();
			((Staff) person).setDept(dept);
		}
	
	}
	
	// 삭제하기
	public void removePerson() {
		System.out.print("주민번호: ");
		String ssn = sc.next();
		if(manager.removePerson(ssn)) {
			System.out.println("해당 정보가 삭제되었습니다.");
		} else {
			System.out.println("해당 정보가 없습니다.");
		}
	}
	
	// 전체출력
	public void showAllPersons() {
		manager.getAllPersons();
	}
}
