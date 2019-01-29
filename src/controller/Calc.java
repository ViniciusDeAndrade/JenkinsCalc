package controller;

public class Calc {

	public static double sum (double x, double y) {
		return x+y;
	}
	
	public static double mult(double x, double y) {
		return x * y;
	}
	
	public static double sub(double x, double y) {
		return x - y;
	}
	
	public static double div (double x, double y) throws Exception {
		if(y == 0)
			throw new Exception("cannot divide for 0");
		return x/y;
	}
	
}
