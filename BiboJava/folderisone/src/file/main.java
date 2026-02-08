package file;
import java.io.*;
import java.util.Scanner;

public class main {

	public static void main(String[]args)  {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\j\\Documents\\BiboJava\\FILES\\readthis.txt");
			DataInputStream bis=new DataInputStream(fis);
			
			FileReader FR=new FileReader("C:\\Users\\j\\Documents\\BiboJava\\FILES\\readthis.txt");
			BufferedReader BR=new BufferedReader(FR);
			String line= BR.readLine();
			int i;
//			System.out.println(line);
			Scanner scrd=new Scanner(new File("C:\\Users\\j\\Documents\\BiboJava\\FILES\\readthis.txt"));
			int x = 0,balance=0;
			String name = null;
			while(scrd.hasNext()) {
//				System.out.print(scrd.next()+" "+scrd.nextInt());
				name=scrd.next();x=scrd.nextInt();balance=scrd.nextInt();
				System.out.println("Name: "+name+" "+"ID: "+x+" "+"Balance: "+balance);
			}
//			System.out.println("Name: "+name+" "+"ID: "+x+" "+"Balance: "+balance);
//				System.out.println(line);
//			}
//			fis.close();
			}
		catch (FileNotFoundException e) {System.out.println("File not found");System.exit(-1);}
		catch (IOException e) {e.getMessage();}
		
	}
}



/*
 * byte[] data=new byte[10]; int offset=0; for(int i=0;i<data.length;i++) {
 * System.out.print(" Array: "+i); data[i]=(byte)
 * System.in.read(data,offset,data.length-offset); }
 * 
 * for(int j=0;j<data.length;j++) { System.out.println(data[j]); }
 */