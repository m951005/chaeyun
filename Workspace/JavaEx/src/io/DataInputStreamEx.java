package io;

import java.io.*;

public class DataInputStreamEx {
	public static void main(String[] args) throws Exception {
		System.out.println("*** 프로그램 시작 ***");
		DataInputStream dis = 
				new DataInputStream(new FileInputStream(new File("/Users/Minji/DEV/Data/data.dat")));
		
		boolean data1 = dis.readBoolean();
		int data2 = dis.readInt();
		double data3 = dis.readDouble();
		String data4 = dis.readUTF();
		// 읽어드리는 순서는 입력 순서와 동일하게 해주어야 함. 순서가 달라지게 되면 다른 타입으로 데이터를 읽어올 수 있음
		
		dis.close();
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		System.out.println("data4 : " + data4);
		System.out.println("*** 프로그램 종료 ***");
	}

}
