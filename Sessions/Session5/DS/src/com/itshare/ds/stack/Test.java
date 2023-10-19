
package com.itshare.ds.stack;

import java.util.*;

 
public class Test {

	public static void main(String[] args) {
	
		
		Stack<String> stack = new Stack<>();
		stack.push("ahmed");
		stack.push("mohamed");
		stack.push("menna");
		stack.pop();
		stack.push("saed");
		
		System.out.println(stack.peek());

		
		
		System.out.println(stack);
//
//		System.out.println(stack.peek());
//		System.out.println(stack);

//		stack.pop();
//		stack.pop();
//		stack.pop();
//		System.out.println(stack);
	}

}
