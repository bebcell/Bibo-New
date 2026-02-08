package file;
import java.io.*;
public class write {
	public static void main(String[]args) {
		int number=999912;
		final String[] descs = {
			    "Java T-shirt",
			    "Java Mug",
			    "Duke Juggling Dolls",
			    "Java Pin",
			    "Java Key Chain"
			};
		
		
		try {
			
		FileInputStream fis=new FileInputStream("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt");
		DataInputStream dis=new DataInputStream(fis);
		
			
			
			
		FileOutputStream fos=new FileOutputStream("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(fos);
		PrintStream ps=new PrintStream(fos);
		Writer fwr= new FileWriter("C:\\Users\\j\\Documents\\BiboJava\\FILES\\writethis.txt");
		Writer bwr=new BufferedWriter(fwr);
		
		
		for(int i=0;i<4;i++) {
//			bos.write(i);
//			dos.writeUTF(descs[i]);
//			if(i%8==7){bos.write(32);bos.write(32);bos.write(32);bos.write(32);}
			
//			else{System.out.print("     ");}
		}
//		ps.print("This will be the first true file writing\nStop playin");
		bwr.write("Superman is the best!");
		ps.append("\nthis is the last line1");
//		dos.writeInt(number);
//		dos.writeDouble(Double.MAX_VALUE);
		dos.close();
//		bos.flush();
//		bos.close();
//		fos.close();
//		System.out.println(dis.readDouble());
//		System.out.print(dis.readInt());
		dis.close();
		ps.close();
		bwr.close();
		}
		catch (FileNotFoundException e) {System.out.println("File Not Found");System.exit(-1);}
		catch (IOException e) {System.out.println(e.getMessage());}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
}
