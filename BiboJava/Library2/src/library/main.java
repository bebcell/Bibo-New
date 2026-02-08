package library;

public class main {

	abstract static class items{
		private String title;
		private int year;
		static int counter=0;
		
		abstract String display();
	}
	
	final static class  Book extends items{
		private String authour;
		public Book(String title,int year,String authour) {
			super.title=title;super.counter++;
			super.year=year;this.authour=authour;
		}
		public String display() {
			return super.title+"    "+super.year+"     "+authour;
		}
	}
	
	final static class Magazine extends items{
		private int issueNumber;
		public Magazine(String title,int year,int issuenumber) {
			super.title=title;super.counter++;
			super.year=year;this.issueNumber=issuenumber;
		}
		
		public String display(){
			return super.title+"    "+super.year+"    "+issueNumber;
		}
		
	}
	
	public static void main(String[]args) {
		items[]Items =new  items[5];
		Items[0]=new Book("King",1989,"Bibo");
		Items[1]=new Book("Queen",1990,"Sara");
		Items[2]=new Magazine("Programming 1",2020,1);
		Items[3]=new Magazine("Programming 2",2024,19);
		
		for(int i=0;i<Items.length;i++) {
			System.out.println(Items[i].display());
		}
		System.out.print(items.counter);
	}
	
	
}
