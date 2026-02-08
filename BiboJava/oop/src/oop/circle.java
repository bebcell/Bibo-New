package oop;

public class circle {
	
	public static final double pi=3.141;
	public double y;
	
	public circle() {
		y=0;
	}
	
	public circle(double x) {
		y=x;
	}
	
	
	public double AreaOfCircle() {
		double result = y*y*pi;
		System.out.println(result);
		return result;
	}
	public void AreaOfCircle(boolean x) {
		if (x) {
		double result = y*y*pi;
		System.out.println(result);
		}
	}
}
