package ui;

import java.util.*;

import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import vo.*;

import manager.SchoolManager;

public class SchoolUI {
	private Scanner scanner = new Scanner(System.in);
	private SchoolManager manager = new SchoolManager();
	
	public SchoolUI() {
		boolean flag = true;
		while (flag) {
			showMain();
			int input = 0;
			try {
				input = scanner.nextInt();				
				switch (input) {
					case 1: addPerson(); break;
					case 2: findPerson(); break;
					case 3: updatePerson(); break;
					case 4: removePerson(); break;
					case 5: showAllPersons(); break;
					case 6: flag = false; break;
					default: System.out.println("다시 입력해 주세요");
				}
			} catch (Exception e) {
//				System.out.println(e);
				System.out.println("숫자를 입력하세요");
				scanner.next();
				continue;
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
		int input = scanner.nextInt();
		
		if (input > 0 && input < 4) {
			System.out.print("이름: ");
			String name = scanner.next();
			System.out.print("주민번호: ");
			String ssn = scanner.next();
			int age = 0;
			while(true) {
				try {
					System.out.print("나이: ");
					age = scanner.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("나이는 숫자로 입력해주세요");
					scanner.next();
				}				
			}
			
			Person p = null;
			try {
				switch (input) {
				case 1:
					System.out.print("학번: ");
					String stdNo = scanner.next();
					
					p = manager.addPerson(new Student(name, ssn, age, stdNo));
					break;
				case 2:
					System.out.print("전공: ");
					String major = scanner.next();
					
					p = manager.addPerson(new Teacher(name, ssn, age, major));
					break;
				case 3:
					System.out.print("부서: ");
					String dept = scanner.next();
					
					p = manager.addPerson(new Staff(name, ssn, age, dept));
					break;
				default: System.out.println("다시 입력해 주세요");
				}
				System.out.println("등록 성공!!");
			} catch (DuplicateSsnException e) {
				System.out.println(e.getMessage());				
			}
		} else {
			System.out.println("잘못 입력 했습니다.");
		}
	}
	
	// 검색하기
	public void findPerson() {
		System.out.print("검색할 주민번호: ");
		String ssn = scanner.next();
		Person p = null;
		try {
			p = manager.findPerson(ssn);			
			System.out.println(p);
		} catch (PersonNotFoundException e) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	// 수정하기
	public void updatePerson() {
		System.out.print("수정할 대상의 주민번호: ");
		String ssn = scanner.next();
		Person p = null;
		try {
			p = manager.findPerson(ssn);
			
			System.out.println("검색결과: " + p);
			System.out.print("수정할 이름: ");
			String name = scanner.next();
			p.setName(name);
			System.out.println("수정할 나이: ");
			int age = scanner.nextInt();
			p.setAge(age);
			
			if (p instanceof Student) {
				System.out.println("수정할 학번: ");
				((Student)p).setStdNo(scanner.next());
			} else if (p instanceof Teacher) {
				System.out.println("수정할 전공과목: ");
				((Teacher)p).setMajor(scanner.next());
			} else if (p instanceof Staff) {
				System.out.println("수정할 부서: ");
				((Staff)p).setDept(scanner.next());
			}
			System.out.println("정보가 수정 되었습니다.");
		} catch (PersonNotFoundException e) {
			System.out.println("주민번호에 해당하는 사람이 없습니다.");
		}
	}
	
	// 삭제하기
	public void removePerson() {
		System.out.print("삭제할 주민번호: ");
		String ssn = scanner.next();
		if (manager.removePerson(ssn)) {
			System.out.println("삭제 되었습니다.");
		} else {
			System.out.println("삭제 대상이 없습니다.");
		}
	}
	
	// 전체출력
	public void showAllPersons() {
		Set<Person> result = manager.getAllPersons();
		Iterator<Person> it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}