package com.itshare.files.creation;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		File object = new File("D:\\work space\\Session4\\Files\\src\\com\\itshare\\files\\creation\\ahmed.txt");
		
		try {
			
			boolean x = object.createNewFile();
			
			System.out.println(x);
			
			if(x == true) {
				System.out.println("file created suceesfully");
				System.out.println(object.getName());
				System.out.println(object.getAbsolutePath());
				System.out.println(object.getParent());
			}else
				System.out.println("file already exists");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
