package file;
import java.io.*;
public class out {
	public static void main(String[]args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(fos);
			
			PrintStream ps=new PrintStream(fos);
			Writer w=new FileWriter("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt");
			
//			w.append("SUPER LAZY MAN IS THE WINNER");
			ps.println("THE WORLD IS ENDING");
			ps.print("men are not real bro");
//			dos.writeChars("sdafekaidsaf");
//			bos.write();	 writes in bytes
//			fos.write(); writes in bytes
//			bos.flush();
			w.close();
			fos.close();
			dos.close();
			bos.close();
			ps.close();
			
		}
		catch(FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
		catch(Exception e) {System.out.println(e);}
	}		
}
