
package com.itshare.ds.task2;

import java.util.*;

 
public class Test {

	public static void main(String[] args) {
	
		
		HashSet<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(10);
		hash.add(3);
		System.out.println(hash);

//		System.out.println("1 is " + hash.contains(1));
//		System.out.println("2 is " + hash.contains(2));
//		System.out.println("3 is " + hash.contains(3));
//		System.out.println("4 is " + hash.contains(4));
//		System.out.println("5 is " + hash.contains(5));
//		System.out.println("6 is " + hash.contains(6));
//		System.out.println("7 is " + hash.contains(7));
//		System.out.println("8 is " + hash.contains(8));
//		System.out.println("9 is " + hash.contains(9));
//		System.out.println("10 is " + hash.contains(10));
		
		
		for(int i =10; i>0 ;i--) {
		//	System.out.println( hash.contains(i));
			
			boolean x =hash.contains(i);
			if( x == true) {
				System.out.println(i +" is exsited");
			}else
				System.out.println(i +" is not exsited");

			
		}
		
//		
//		for(Integer item : hash) {
//			System.out.println(item);
//		}
//
//
//		
		
	
		
	}

}
