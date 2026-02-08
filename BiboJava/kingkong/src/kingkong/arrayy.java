package kingkong;
import java.util.Scanner;

public class arrayy {
	public static void main(String[]args) {

		Scanner input= new Scanner(System.in);
		
		int [][] array1=new int[10][2];
		int x=0;
		for (int i =0; i<array1.length;i++) {
			for(int j=0; j<array1[i].length;j++) {
				array1[i][j]=x;x++;	
			}
		}
		for (int i =0; i<array1.length;i++) {
			System.out.println("Out : "+i);
			for(int j=0; j<array1[i].length;j++) {
				System.out.print(": "+array1[i][j]);
			}
			System.out.println();
		}
		System.out.print(array1.length);
	}
}
