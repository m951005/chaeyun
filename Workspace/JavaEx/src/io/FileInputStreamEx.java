package io;

import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("/Users/Minji/DEV/Data/read.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int readData = fis.read();
			System.out.println(readData);
			System.out.println(fis.read());
			System.out.println(fis.read());
			fis.close();
		} catch (FileNotFoundException fe) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException ie) {
			System.out.println("입출력 에러 발생!");
		}
		System.out.println("*** 프로그램 종료 ***");

	}

}
