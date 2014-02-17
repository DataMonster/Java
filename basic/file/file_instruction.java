//This file is written for file reading and wirting under different circumstances
//Since Java always uses Reader and Writer abstract class and their inheritance class, read, write, flush and close methods
//need to be override.
//If we are trying to treat with text file

//use FileReader for .txt file
FileReader fr = new FileReader("targetpath/targetfile.txt");
int next = 0;
while((next = fr.read())!=-1) //also can use read(char[] next, int off, int length)
{
  System.out.println(next);
}

//Actually, all FileReader class is from the InputStreamReader. To imporve efficiency, BufferedReader class has the readLine() method
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("targetpath/targetfile.txt")));
String next = null;
while(next = (br.readLine())! = null)
{
  System.out.println(next);
}

//Use Writer class for .txt writing
FileWriter fw = new FileWriter("targetpath/targetfile.txt");  
String next = "hello world!";  
fw.write(next,0,next.length());  
fw.flush();  

//Use OutputStreamWriter 
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("targetpath/targetfile.txt"));  
osw.write(next,0,next.length());  
osw.flush(); 

//Use PrintWriter, what is the difference?
PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("targetpath/targetfile.txt")),true);  
pw.println(next);  

//Use BufferedWriter



//multi-thread comparing the time-consuming
