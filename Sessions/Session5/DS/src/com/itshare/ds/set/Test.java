
package com.itshare.ds.set;

import java.util.*;

 
public class Test {

	public static void main(String[] args) {
	
		
		//ArrayList<String> arr = new ArrayList<String>();
		
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(100);
		hash.add(200);
		hash.add(300);
		hash.add(100);
		hash.add(412);
		hash.add(201240);
		hash.add(123);
		hash.add(14);
		System.out.println(hash);
		System.out.println(hash.size());

		//System.out.println(hash.get(1));


	
	
//For each - enhanced for (get all data)		
	for (Integer item : hash) {
		System.out.println(item);
	}

	
			
	}

}
