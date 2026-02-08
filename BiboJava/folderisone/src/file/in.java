package file;
import java.io.*;
import java.util.Scanner;
public class in {
	public static void main(String[]args) {
		try {
		 FileInputStream fis=new FileInputStream("C:\\Users\\j\\Documents\\BiboJava\\FILES\\readthis.txt");
		 BufferedInputStream bis=new BufferedInputStream(fis);
		 DataInputStream dis=new DataInputStream(fis);
		 
		 Reader r=new FileReader("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt"); 
		 FileReader fr=new FileReader("C:\\Users\\j\\Documents\\BiboJava\\FILES\\readthis.txt");
		 BufferedReader br=new BufferedReader(fr);
	
		 
		 Scanner s=new Scanner(fr);
		 while(br.read()!=-1) {
			 
			 System.out.println(br.readLine() );
			 
		 }
		
		}
		catch(FileNotFoundException e) {System.out.println("File not found");} 
		catch(IOException e) {System.out.println("IO Exception ");}
		catch(Exception e) {System.out.println("Error");}
	}
}