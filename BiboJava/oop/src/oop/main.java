package oop;
import java.util.Scanner;
public class main {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);

//		circle circle1=new circle();
//		circle circle2=new circle();
//		circle1.y=4;
//		circle2.y=1;														#4
//		double areaa2= circle2.AreaOfCircle();
//		double areaa= circle1.AreaOfCircle();

//_____________________________________
//		circle circle1=new circle(2);
//		double area1=circle1.AreaOfCircle();								#3
//		System.out.println(area1);
//_____________________________________
//		circle circle1=new circle(2);
//		circle1.AreaOfCircle();	
		
		/*
		 * setandget info1=new setandget();
		 * 
		 * info1.setx(10.4); System.out.println(info1.getx());
		 */
		
		ooparray[] student=new ooparray[3];
		student[0]=new ooparray(1,19,"king");
		student[0].setid(2);
		student[0].setname("King the Kong");
		student[0].setage(19);
		
		System.out.println(student[0].getid());
		System.out.println(student[0].getage());
		System.out.println(student[0].getname());
	
		
	}
	
}

