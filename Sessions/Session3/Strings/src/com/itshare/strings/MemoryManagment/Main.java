package com.itshare.strings.MemoryManagment;

public class Main {

	public static void main(String[] args) {

		
		Test ref1 = new Test();
		ref1.x=30;

		System.out.println(ref1.x);
		
		
		Test ref2 = new Test();
		
		System.out.println(ref2.x);

		
		
		ref2 = ref1 ; 
		System.out.println(ref2.x);

		

		
		
	}

}
