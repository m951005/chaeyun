package io;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("/Users/Minji/DEV/Data/data.dat");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeInt(5);
		dos.writeDouble(1.2);
		dos.writeUTF("안녕하세요");
		
		dos.close();		// DataOutputStream만 닫아줘도 FileOutputStream은 dos에 연결되어 있으므로 java 시스템과는 연결이 자동으로 끊어지게 됨
		System.out.println("*** 프로그램 종료 ***");
	}

}
