package library;

public class books {
	protected int id,copies;
	protected String title, author;
	
	protected books(int idx, int copiesx, String titlex,String authorx) {
		id=idx;
		copies=copiesx;
		title=titlex;
		author=authorx;
	}
	public void Setid(int idx) {id=idx;}
	public void Setcopies(int copiesx) {copies=copiesx;}
	public void Settitle(String titlex) {title=titlex;}
	public void Setauthor(String authorx) {author=authorx;}
	
	public int Getid() {return id;}
	public int Getcopies() {return copies;}
	public String Gettitle() {return title;}
	public String Getauthor() {return author;}
	
	public void displayinfo() {
		System.out.print(id);
		System.out.print(" "+copies);
		System.out.print(" "+title);
		System.out.print(" "+author);
	}
}
















