package exception;

import java.io.*;

public class CheckedException {
//	public static void main(String[] args) {
//		File file = new File("memo.txt");
//		System.out.println(3 / 0);
//		try {
//			InputStream is = new FileInputStream(file);
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void methodA() {
		try {
			methodB();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void methodB() throws FileNotFoundException {
		methodC();
	}
	
	public static void methodC() throws FileNotFoundException {
		File file = new File("memo.txt");
		InputStream is = new FileInputStream(file);
	}
	
	
	
}
