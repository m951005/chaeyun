package io;

import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Minji/DEV/Data/read.txt");
		File newFile = new File("/Users/Minji/DEV/Data/read2.txt");
		// canRead()
		System.out.println("canRead() : " + file.canRead());
		// canWrite()
		System.out.println("canWrite() : " + file.canWrite());
		// createNewFile()
		System.out.println("createNewFile() : " + newFile.createNewFile());
		// delete()
		System.out.println("delete() : " + newFile.delete());
		// exists()
		System.out.println("exists() : " + file.exists());
		// getAbsolutePath()
		System.out.println("getAbsolutePath() : " + file.getAbsolutePath());
		// getName()
		System.out.println("getName() : " + file.getName());
		// getParent()
		System.out.println("getParent() : " + file.getParent());
		// getPath()
		System.out.println("getPath() : " + file.getPath());
		// length()
		System.out.println("length() : " + file.length());
		// mkdir()
		System.out.println("mkdir() : " + (new File("/Users/Minji/DEV/Data/dir1")).mkdir());
	}

}
