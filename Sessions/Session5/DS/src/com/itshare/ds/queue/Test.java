
package com.itshare.ds.queue;

import java.util.*;

 
public class Test {

	public static void main(String[] args) {
	
		
		PriorityQueue<String>  queue = new PriorityQueue<> ();  
		queue.add("amer");
		queue.add("sad");
		queue.add("sss");

		queue.add("aa");
		
		queue.add("ahmed");
		
		queue.add("mohamed");
		
		queue.remove();
		queue.remove();

		System.out.println(queue);
		
		System.out.println(queue.element());
        
	}

}
