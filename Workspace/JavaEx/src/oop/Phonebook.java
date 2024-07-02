package oop;

import java.util.Scanner;

/*
 * 전화번호부
 * - 사용자로부터 이름, 나이, 전화번호를 입력받아 배열에 저장
 * - 이름으로 검색, 수정, 삭제
 * - 전체 전화번호부 내역 출력
 */

public class Phonebook {
	private Person[] personArr;		// Person의 배열
	private Scanner scanner;
	private int count = 0;			// 배열에 저장된 index의 개수
	int search = 0;
	
	public Phonebook(int max) {
		personArr = new Person[max];
		scanner = new Scanner(System.in);
	}

	// main
	public static void main(String[] args) {
		Phonebook pb = new Phonebook(100);
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
					insertPerson();
					break;
					
				case"2" :
					System.out.print("검색할 이름 : ");
					String name = scanner.next();
					searchPerson(name).printInfo();
					break;
					
				case"3" :
					System.out.print("수정할 이름 : ");
					name = scanner.next();
					if(updatePerson(name)) {
						System.out.println("수정이 완료되었습니다.");
					} else {
						System.out.println("다시 시도해주세요.");
					}
					break;
					
				case"4" :
					System.out.print("삭제할 이름 : ");
					name = scanner.next();
					if(deletePerson(name)) {
						System.out.println("삭제 되었습니다.");
					} else {
						System.out.println("다시 시도해주세요.");
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
		
		personArr[count] = new Person(name, age, phone);
		
		return personArr[count++];
	}
	
	// 이름으로 검색 메소드
	public Person searchPerson(String name) {
		for(int i = 0; i < count; i++) {
			if(personArr[i].getName().equals(name)) {
				return personArr[i];
			}
			search = i;
		}
		System.out.println("해당하는 이름이 없습니다.");
		return null;
	}
	
	// 이름으로 검색해서 전화번호부 수정 메소드
	public boolean updatePerson(String name) {
		searchPerson(name).printInfo();
		
		System.out.println("수정할 항목 선택");
		System.out.println("1. 이름");
		System.out.println("2. 나이");
		System.out.println("3. 전화번호");
		System.out.println("4. 이전 메뉴");
		System.out.print("선택> ");
		String input = scanner.next();
		
		switch(input) {
			case"1" :
				System.out.print("새로운 이름 : ");
				searchPerson(name).setName(scanner.next());
				break;
			case"2" :
				System.out.print("새로운 나이 : ");
				searchPerson(name).setAge(scanner.nextInt());
				break;
			case"3" :
				System.out.print("새로운 전화번호 : ");
				searchPerson(name).setPhone(scanner.next());
				break;
		}

		return true;
	}
	
	// 이름 검색 후 삭제 메소드
	public boolean deletePerson(String name) {
		searchPerson(name).printInfo();
		for(int i = search+1; i < personArr.length-1; i++) {
			personArr[i] = personArr[i+1];
		}
		return true;
	}
	
	// 등록된 전체 전화번호부 출력 메소드
	public void printAll() {
		for(int i = 0; i < count; i++) {
			if(personArr[i] == null) {
				return;
			}
			personArr[i].printInfo();
		}
	}
	

}
