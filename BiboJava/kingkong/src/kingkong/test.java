package kingkong;

public class test {
	static int num3=11;
	static int num4=20;
	public static void swap(int in1,int in2) {
		num3=in2;num4=in1;
	}
	
	public static void main(String[]args) {
		int num1=19;
		int num2=30;
		swap(num3,num4);
		System.out.println(num3+"THe "+num4);
	}
	
}
