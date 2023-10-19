package com.itshare.Math.task;

public class Math {

	final static int PI=5;
	
	static int max(int a , int b) {
		if(a>=b)
			return a;
		else
			return b;
	}
	
	
	static double max(double a , double b) {
		if(a>=b)
			return a;
		else
			return b;
	}
	
	
	static int min(int a , int b) {
		if(a<=b)
			return a;
		else
			return b;
	}
	
	
	static double min(double a , double b) {
		if(a<=b)
			return a;
		else
			return b;
	}
	
	
	
	static int abs(int a) {
		
		if(a<0)
			return a* -1;
		else
			return a;
	}
	
	
	static int square (int a) {
		return a*a;
	}
	
	
}
