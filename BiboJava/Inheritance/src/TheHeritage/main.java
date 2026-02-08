package TheHeritage;
import java.util.Scanner;

abstract class book{
	String title, authour;
	int year;
	
	public book(String title,String authour,int year) {
		this.title=title;
		this.authour=authour;
		this.year=year;
	}
	abstract String display();		
}
class Textbook extends book{
	 String subject;
	 
	 
	 public String display(){
		 return "Authour: "+super.authour+"  Title: "+super.title+" Production year: "+super.year+" Subject: "+this.subject;
	 }
	 
	 public Textbook(String title,String authour,int year,String subject) {
		super(title,authour,year);
		this.subject=subject;
	}
}	
class Novel extends book{
	String genre;
	
	
	public String display(){
		return "Authour: "+super.authour+"  Title: "+super.title+" Production year: "+super.year+" Genre: "+this.genre;
	}
	
	public Novel(String title,String authour,int year,String genre) {
		super(title,authour,year);
		this.genre=genre;
	}
}

public class main {

	
	
	public static void main (String[]args) {
		Scanner input=new Scanner(System.in);
		
//		Main outer = new Main();
		
		Textbook tb1=new Textbook("The Khilafa","Bibo",1990,"History");
		Novel nvl1=new Novel("kong","Kara",2019,"True Story");
		
		System.out.println(nvl1.display());
		System.out.println(tb1.display());
		
	}
}
