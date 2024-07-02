package oop;

import java.util.*;

public class MemberArrayList {
	String id;
	String name;
	String pw;
	int age;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberArrayList> arr = new ArrayList<>();
		MemberArrayList m = new MemberArrayList();
		
		while(true) {
			m.choice();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				arr.add(m.input());
				break;
				
			case 2:
				System.out.print("검색할 회원의 이름 : ");
				String name = sc.next();
				for(int i = 0; i < arr.size(); i++) {
					if(name.equals(arr.get(i).name)) {
						System.out.println(arr.get(i).output());
					}
				}
				break;
				
			case 3:
				System.out.print("검색할 회원의 이름 : ");
				name = sc.next();
				for(int i = 0; i < arr.size(); i++) {
					if(name.equals(arr.get(i).name)) {
						arr.get(i).correction();
					}
				}
				break;
				
			case 4:
				for(int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i).output());
				}
				break;
				
			case 5:
				System.exit(0);
				
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
	
	public void choice() {
		System.out.println("=========================");
		System.out.println("\t회원정보 관리 시스템");
		System.out.println("=========================");
		System.out.println("1. 회원정보 등록");
		System.out.println("2. 회원정보 검색");
		System.out.println("3. 회원정보 수정");
		System.out.println("4. 전체 회원정보 출력");
		System.out.println("5. 시스템 종료");
		System.out.print("선택 > ");
	}
	
	public MemberArrayList input() {
		Scanner sc = new Scanner(System.in);
		MemberArrayList mem = new MemberArrayList();
		
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("Age : ");
		int age = sc.nextInt();
		
		mem.id = id;
		mem.name = name;
		mem.pw = pw;
		mem.age = age;
		
		return mem;
	}
	
	public String output() {
		return "ID : " + id + ", Name : " + name + ", PW : " + pw + ", Age : " + age;
	}
	
	public void correction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 항목 -> 1. Name    2. PW    3. Age");
		System.out.print(">> ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("New Name : ");
			String name = sc.next();
			this.name = name;
			break;
			
		case 2:
			System.out.print("New PW : ");
			String pw = sc.next();
			this.pw = pw;
			break;
		
		case 3:
			System.out.print("New Age : ");
			int age = sc.nextInt();
			this.age = age;
			break;
			
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}


}
