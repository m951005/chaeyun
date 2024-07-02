package io;

import java.io.*;

public class FileReaderWriterEx {
	public static void main(String[] args) throws Exception {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("/Users/Minji/DEV/Data/memo.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("안녕하세요\n");
		fw.write("제 이름은\n");
		fw.write("홍길동입니다.");
		
		fw.close();
		
		FileReader fr = new FileReader(file);
		int readData = 0;
		String message = "";
		// read() 메소드는 stream의 가장 마지막에 도달하면 -1 을 return
		while((readData = fr.read()) != -1) {
//			System.out.println((char)readData);
			message += (char)readData;
		}
		System.out.println(message);
		
		fr.close();
		
		System.out.println("*** 프로그램 종료 ***");
	}

}
