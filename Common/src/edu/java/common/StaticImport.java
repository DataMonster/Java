package edu.java.common;

//import static package will reduce the code lines
import static java.lang.System.*;
import static java.lang.Math.*;

/*
 * java.lang
 * java.util
 * java.net
 * java.io
 * java.text
 * java.sql
 * java.awt
 * java.swing
 */

public class StaticImport {
	public static void main(String... args){
		out.println(PI);
		//it should be System.out.println(Math.PI);
	}
}
