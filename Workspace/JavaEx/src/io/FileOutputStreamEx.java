package io;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		System.out.println("*** 프로그램 시작 ***");
		File file = new File("/Users/Minji/DEV/Data/read.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(10);
			fos.write(5);
			fos.write(2);
			fos.close();
		} catch (FileNotFoundException fe) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (IOException ie) {
			System.out.println("입출력 에러 발생");
		}
		System.out.println("*** 프로그램 종료 ***");
	}

}
