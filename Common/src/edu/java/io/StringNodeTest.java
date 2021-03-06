package edu.java.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * 
 */
public class StringNodeTest {

	public static void main(String[] args) {
		String str = "this is a test\n" + "we have no idea\n";
		StringReader sr = new StringReader(str);
		char[] buffer = new char[6];
		int hasRead = 0;
		try {
			while ((hasRead = sr.read(buffer)) > 0) {
				System.out.println(new String(buffer, 0, hasRead));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			sr.close();
		}
		
		
		StringWriter sw = new StringWriter(20);
		sw.write("this is a writing test ");
		sw.write("whatever\n");
		System.out.println(sw.toString());
	}

}
