package io;

import java.io.*;

public class BufferedInputOutputStreamEx  {
	public static void main(String[] args) throws Exception {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("data.dat");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("Hello World");
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		System.out.println(dis.readUTF());
		
		dis.close();
		
		System.out.println("*** 프로그램 종료 ***");
	}

}
