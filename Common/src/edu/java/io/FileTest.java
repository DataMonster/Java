package edu.java.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	
	public static void main(String[] args) throws IOException {
		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		File tmpFile = File.createTempFile("aaa",".txt",file);
		//tmpFile.deleteOnExit();

		System.out.println(file.getAbsolutePath());
		
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("new File is existed or not :" + newFile.exists());
		newFile.createNewFile();
		newFile.mkdir();
		String[] fileList = file.list();
		System.out.println("===========");
		
		for(String fileName:fileList){
			System.out.println(fileName);
		}
		
		File[] roots = File.listRoots();
		System.out.println("===========");
		for(File root:roots){
			System.out.println(root);
		}
		
	}

}
