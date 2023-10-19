
package com.itshare.ds.task;

import java.util.*;

 
public class Test {

	public static void main(String[] args) {
	
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ahmed");
		list.add("ahmed");
		list.add("mohamed");
		list.add("karim");
		list.add("ahmed");

		System.out.println(list);

		

//		HashSet<String> hash = new HashSet<String>();
//		hash.add(list.get(0));
//		hash.add(list.get(1));
//		hash.add(list.get(2));
//		hash.add(list.get(3));
//		hash.add(list.get(4));
//
//		System.out.println(hash);

		
		HashSet<String> hash = new HashSet<String>(list);

		System.out.println(hash);
	}

}
