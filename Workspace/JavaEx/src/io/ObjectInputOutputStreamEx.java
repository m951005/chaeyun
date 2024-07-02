package io;

import java.io.*;

class Member implements Serializable {		// Serializable의 구현해야만 object로 File에 쓰고 읽을 수 있다
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ObjectInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("Object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		String[] array = new String[3];
		array[0] = "Hello";
		array[1] = "World";
		array[2] = "안녕";
		
		Member member = new Member("홍길동", 25);
		
		oos.writeObject(array);
		oos.writeObject(member);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		String[] result = (String[])ois.readObject();
		for(String s : result) {
			System.out.println(s);
		}
		
		Member readMember = (Member)ois.readObject();
		System.out.println(readMember.name + ", " + readMember.age);
		
		System.out.println("*** 프로그램 종료 ***");
	}

}
