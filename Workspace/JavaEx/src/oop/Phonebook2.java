package oop;

import java.util.Scanner;

/*
 * 전화번호부
 * - 답안 확인 후 재작성
 */

public class Phonebook2 {
	private Person[] personArr;		// Person의 배열
	private Scanner scanner;
	private int count;			// 배열에 저장된 index의 개수 -> 기본값 0
	
	public Phonebook2(int max) {
		personArr = new Person[max];
		scanner = new Scanner(System.in);
	}

	// main
	public static void main(String[] args) {
		Phonebook2 pb = new Phonebook2(100);
		pb.start();
	}
	
	// 시작 메소드
	public void start() {
		while(true) {
			System.out.println("=====================");
			System.out.println("      전화번호부");
			System.out.println("=====================");
			System.out.println("1. 전화번호부 등록");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 전화번호부 수정");
			System.out.println("4. 전화번호부 삭제");
			System.out.println("5. 전화번호부 전체출력");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택> ");
			String input = scanner.next();
			
			switch(input) {
				case"1" :
					personArr[count++] = insertPerson();	// 메소드 반환 값 배열에 삽입 & 인덱스 값 +1 
					break;
					
				case"2" :
					System.out.print("검색할 이름 : ");
					String name = scanner.next();
					if(searchPerson(name) != null) {
						searchPerson(name).printInfo();
					} else {
						System.out.println("검색 결과가 없습니다.");
					}
					break;
					
				case"3" :
					System.out.print("수정할 이름 : ");
					name = scanner.next();
					if(updatePerson(name)) {
						System.out.println("수정이 완료되었습니다.");
					} else {
						System.out.println("수정에 실패했습니다.");
					}
					break;
					
				case"4" :
					System.out.print("삭제할 이름 : ");
					name = scanner.next();
					if(deletePerson(name)) {
						System.out.println("해당 데이터가 삭제되었습니다.");
					} else {
						System.out.println("삭제에 실패했습니다.");
					}
					break;
					
				case"5" :
					printAll();
					break;
					
				case"6" :
					System.exit(0);
					
				default :
					System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	
	// 전화번호부 등록 메소드
	public Person insertPerson() {
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		System.out.print("전화번호 : ");
		String phone = scanner.next();
		
		Person person = new Person(name, age, phone);
		
		return person;
	}
	
	// 이름으로 검색 메소드
	public Person searchPerson(String name) {
		for(int i = 0; i < count; i++) {
			if(personArr[i].getName().equals(name)) {
				return personArr[i];
			}
		}
		return null;
	}
	
	// 이름으로 검색해서 전화번호부 수정 메소드
	public boolean updatePerson(String name) {
		Person person = searchPerson(name);
		if(person != null) {
			System.out.println("수정할 항목 선택");
			System.out.println("1. 이름");
			System.out.println("2. 나이");
			System.out.println("3. 전화번호");
			System.out.print("선택> ");
			String input = scanner.next();
			
			switch(input) {
				case"1" :
					System.out.print("새로운 이름 : ");
					person.setName(scanner.next());
					break;
				case"2" :
					System.out.print("새로운 나이 : ");
					person.setAge(scanner.nextInt());
					break;
				case"3" :
					System.out.print("새로운 전화번호 : ");
					person.setPhone(scanner.next());
					break;
			}
			return true;
		}
		return false;
	}
	
	// 이름 검색 후 삭제 메소드
	public boolean deletePerson(String name) {
		if(searchPerson(name) != null) {
			searchPerson(name).printInfo();
			for(int i = 0; i < count; i++) {
				if(personArr[i].getName().equals(name)) {
					for(int j = i; j < count; j++) {
						if(j == count-1) {
							personArr[j] = null;
							break;
						}
						personArr[j] = personArr[j+1];
					}
					count--;
				}
			}
			return true;
		}
		return false;
	}
	
	// 등록된 전체 전화번호부 출력 메소드
	public void printAll() {
		for(int i = 0; i < count; i++) {
			personArr[i].printInfo();
		}
	}
	

}
