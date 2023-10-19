package com.itshare.exceptions.example4;

public class Calculator {

	
	public int divide(int num1 , int num2) {
		
		 if ( num2 < 0)
		{
			throw new ArithmeticException("this is arthmethic you cant divide for a value less than zero ");

		} else if (num2 == 2000) {
			throw new ArithmeticException("this is arthmethic you cant divide by 2000");

		}
		
		
		return num1/num2;
	}
	
}
