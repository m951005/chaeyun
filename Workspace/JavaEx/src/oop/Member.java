package oop;

import java.util.Scanner;

public class Member {
	// 필드 정의
	String id;			// 아이디
	String name;		// 이름
	String password;	// 비밀번호
	int age;			// 나이
	
	// 메소드
	public String memberInfo() {
//		String info = "id : " + id + ", name : " + name 
//				+ ", password : " + password + ", age : " + age;
//		return info;
		
		return "id : " + id + ", name : " + name 
				+ ", password : " + password + ", age : " + age;
		
	}
	
	public Member createMember() {
		Member mem = new Member();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("PW : ");
		String password = sc.next();
		System.out.print("Age : ");
		int age = sc.nextInt();
		
		mem.id = id;
		mem.name = name;
		mem.password = password;
		mem.age = age;
		
		return mem;
	}
	
	
	public static void main(String[] args) {
		/*
		 * 사용자로부터 id, name, password, age의 값을 입력받아서
		 * Member의 배열에 저장하고,
		 * 사용자의 이름을 검색해서 정보를 출력하는 프로그램을 작성하세요.
		 */
		Member[] memberArr = new Member[10];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Member m = new Member();
		
		while(true) {
			
			System.out.println("==================");
			System.out.println("회원정보 관리 시스템");
			System.out.println("==================");
			System.out.println("1. 회원정보 등록");
			System.out.println("2. 회원정보 검색");
			System.out.println("3. 전체 회원정보 출력");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택> ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				memberArr[index++] = m.createMember();
				break;
				
			case 2 : 
				System.out.print("검색할 회원의 이름 : ");
				String name = sc.next();
				for (int i = 0; i < index; i++) {
					if (name.equals(memberArr[i].name)) {		// 참조형 데이터타입은 변수의 주소값이 각각 다르므로 '=='사용 X, equals로 비교해야 함.
						System.out.println(memberArr[i].memberInfo());
					}
				}
				break;
				
			case 3 : 
				for (int i = 0; i < index; i++) {
					System.out.println(memberArr[i].memberInfo());
				}
				break;
				
			case 4 : 
				System.exit(0);
//				return;
				
			default : 
				System.out.println("잘못 입력하셨습니다.");
				
				
//				// 회원 객체 생성
//				Member m = new Member();
//				
//				// 아이디, 이름, 비밀번호, 나이 정의
//				m.id = "m123";
//				m.name = "홍길동";
//				m.password = "1234";
//				m.age = 20;
//				
//				// 정보 출력
//				System.out.println("아이디 : " + m.id);
//				System.out.println("이름 : " + m.name);
//				System.out.println("비밀번호 : " + m.password);
//				System.out.println("나이: " + m.age);
//				
//				System.out.println(m.memberInfo(m.id, m.name, m.password, m.age));
//				
//				Member m2 = new Member();
//				m2.id = "abc";
//				m2.name = "김개똥";
//				m2.password = "0000";
//				m2.age = 25;
//				
//				System.out.println(m2.memberInfo(m2.id, m2.name, m2.password, m2.age));
//				

		
			}
		}

		
	}

}
