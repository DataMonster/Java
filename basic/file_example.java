import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileReader;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.RandomAccessFile;  
import java.io.Reader;  
public class ReadFromFile {  
/** 
* Read file by byte, for sound and image files
* @param fileName targetfile name
*/  
public static void readFileByBytes(String fileName){  
File file = new File(fileName);  
InputStream in = null;  

try {  
  System.out.println("Read file by byte");  
  // One byte at each time  
  in = new FileInputStream(file);  
  int tempbyte;  
  while((tempbyte=in.read()) != -1){  
    System.out.write(tempbyte);  
  }  
  in.close();  
} catch (IOException e) {  
  e.printStackTrace();  
  return;  
}  
try {  
  System.out.println("Read file by byte, multiple bytes one time");  
  //multiple bytes one time
  byte[] tempbytes = new byte[100];  
  int byteread = 0;  
  in = new FileInputStream(fileName);  
  ReadFromFile.showAvailableBytes(in);  
  //byteread = length
  while ((byteread = in.read(tempbytes)) != -1){  
    System.out.write(tempbytes, 0, byteread);  
  }  
} catch (Exception e1) {  
  e1.printStackTrace();  
} finally {  
  if (in != null){  
  try {  
    in.close();  
  } catch (IOException e1) {  
}  
}  
}  
}  

/** 
* Read file by char, use for text and number files
* @param fileName
*/  
public static void readFileByChars(String fileName){  
File file = new File(fileName);  
Reader reader = null;  
try {  
System.out.println("Read file by char, one char each time");  
reader = new InputStreamReader(new FileInputStream(file));  
int tempchar;  
while ((tempchar = reader.read()) != -1){  
//because under windows, rn mean new line, when these two chars split, there will be two new lines.  
//delete r can deduce useless blank lines 
if (((char)tempchar) != 'r'){  
System.out.print((char)tempchar);  
}  
}  
reader.close();  
} catch (Exception e) {  
e.printStackTrace();  
}  
try {  
System.out.println("Read file by chars, multiple chars each time");  
char[] tempchars = new char[30];  
int charread = 0;  
reader = new InputStreamReader(new FileInputStream(fileName));  
while ((charread = reader.read(tempchars))!=-1){  
if ((charread == tempchars.length)&&(tempchars[tempchars.length-1] != 'r')){  
System.out.print(tempchars);  
}else{  
for (int i=0; i<charread; i++){  
if(tempchars[i] == 'r'){  
continue;  
}else{  
System.out.print(tempchars[i]);  
}  
}  
}  
}  
} catch (Exception e1) {  
e1.printStackTrace();  
}finally {  
if (reader != null){  
try {  
reader.close();  
} catch (IOException e1) {  
}  
}  
}  
}  

/** 
* Read file by line
* @param fileName
*/  
public static void readFileByLines(String fileName){  
File file = new File(fileName);  
BufferedReader reader = null;  
try {  
System.out.println("Read file by line: ");  
reader = new BufferedReader(new FileReader(file));  
String tempString = null;  
int line = 1;  
while ((tempString = reader.readLine()) != null){  
//line number 
System.out.println("line " + line + ": " + tempString);  
line++;  
}  
reader.close();  
} catch (IOException e) {  
e.printStackTrace();  
} finally {  
if (reader != null){  
try {  
reader.close();  
} catch (IOException e1) {  
}  
}  
}  
}  
/** 
* Random read file content
* @param fileName 
*/  
public static void readFileByRandomAccess(String fileName){  
RandomAccessFile randomFile = null;  
try {  
System.out.println("Random read file ");  
// open a file using read-only
randomFile = new RandomAccessFile(fileName, "r");  
// file length
long fileLength = randomFile.length();  
// Start pos  
int beginIndex = (fileLength > 4) ? 4 : 0;  
//move to beginIndex pos  
randomFile.seek(beginIndex);  
byte[] bytes = new byte[10];  
int byteread = 0;  
//each time at most 10 bytes 
//length = readbyte
while ((byteread = randomFile.read(bytes)) != -1){  
System.out.write(bytes, 0, byteread);  
}  
} catch (IOException e){  
e.printStackTrace();  
} finally {  
if (randomFile != null){  
try {  
randomFile.close();  
} catch (IOException e1) {  
}  
}  
}  
}  
/** 
* display inputstream remaining byte number
* @param in 
*/  
private static void showAvailableBytes(InputStream in){  
try {  
System.out.println("current inputstream byte number is " + in.available());  
} catch (IOException e) {  
e.printStackTrace();  
}  
}  
public static void main(String[] args) {  
String fileName = "target.txt";  
ReadFromFile.readFileByBytes(fileName);  
ReadFromFile.readFileByChars(fileName);  
ReadFromFile.readFileByLines(fileName);  
ReadFromFile.readFileByRandomAccess(fileName);  
}  
}  


//add contents to the end of a file  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.RandomAccessFile;  
/** 
* 
*/  
public class AppendToFile {  
/** 
* RandomAccessFile 
* @param fileName 
* @param content  
*/  
public static void appendMethodA(String fileName,  
  
String content){  
try {  
// random access a file using rw
RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");  
// byte number 
long fileLength = randomFile.length();  
//pointer move to the end of the file  
randomFile.seek(fileLength);  
randomFile.writeBytes(content);  
randomFile.close();  
} catch (IOException e){  
e.printStackTrace();  
}  
}  
/** 
* FileWriter 
* @param fileName 
* @param content 
*/  
public static void appendMethodB(String fileName, String content){  
try {  
//open a writer method, use 'true' means to add contents to the file
FileWriter writer = new FileWriter(fileName, true);  
writer.write(content);  
writer.close();  
} catch (IOException e) {  
e.printStackTrace();  
}  
}  
public static void main(String[] args) {  
String fileName = "target.txt";  
String content = "new append!";  
// 
AppendToFile.appendMethodA(fileName, content);  
AppendToFile.appendMethodA(fileName, "append end. n");  
// 
ReadFromFile.readFileByLines(fileName);  
// 
AppendToFile.appendMethodB(fileName, content);  
AppendToFile.appendMethodB(fileName, "append end. n");  
// 
ReadFromFile.readFileByLines(fileName);  
}  
}  
