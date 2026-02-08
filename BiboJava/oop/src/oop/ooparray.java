package oop;

public class ooparray {
	private int id, age;
	private String name;
	
	protected ooparray(int idx,int agex, String namex) {id=idx;age=agex;name=namex;}
	
	protected void setid(int idx) {id=idx;}
	protected void setname(String namex) {name=namex;}
	protected void setage(int agex) {age=agex;}
	
	protected int getid() {return id;}
	protected int getage() {return age;}
	protected String getname() {return name;}
}
