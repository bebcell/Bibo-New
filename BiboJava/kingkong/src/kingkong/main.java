package kingkong;

import java.math.*;
public class main {
	static void SeeSigma(int sigma) {
		for(int i=sigma-1;i>0;i--) {
			System.out.println(sigma+i);
			sigma+=i;
		}
	}
	
	 static int Sigma(int sigma) {
		
		
		/*
		 * for(int i=sigma-1;i>0;i--) sigma+=i;
		 */
		if(sigma>=2) {
			sigma=sigma+Sigma(sigma-1);
		}
		else{
			return 1;
		}
		return sigma;
	}
	
	public static void main(String[]args) {
		
		circle circle1=new circle();
		circle circle2=new circle();
		circle1.y=4;
		circle2.y=1;
		int x=90;
		double areaa2= circle2.AreaOfCircle();
		double areaa= circle1.AreaOfCircle();
		//System.out.print(areaa2);
		//System.out.println(sumx);
		Sigma(x);
	}
	
}
