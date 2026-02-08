package library;
import java.util.Scanner;
public class main {
	
	
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		books[] book=new books[5];
		
		book[0]=new books(1,10,"Can a King Lose?", "bibo");
		book[1]=new books(2,4,"What happend to the lost King", "bibo");
		book[2]=new books(3,6,"the Rise of the King", "bibo");
		book[3]=new books(4,1,"Death is for Everyone", "bibo's son");
		book[4]=new books(5,0,"Not all are ready for Death", "bibo's son");
		
		/*System.out.println(book[1].Getid());
		for(int i=0; i<book.length;i++) {
			book[i].displayinfo();
			System.out.println();*/
		
		for(books  b:book) {
			
			b.displayinfo();
			System.out.println();
		}
	}
}
