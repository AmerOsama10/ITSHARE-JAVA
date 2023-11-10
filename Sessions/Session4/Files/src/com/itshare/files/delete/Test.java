package com.itshare.files.delete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		
		
		
		try {
			File file = new File("D:\\No.11 [NTFS Local Disk]\\ Root Dir\\book store\\ITShare\\Sessions\\Session4\\Files\\src\\com\\itshare\\files\\creation\\ahmed.txt");

			file.createNewFile();
			
			
			FileWriter f = new FileWriter("D:\\No.11 [NTFS Local Disk]\\ Root Dir\\book store\\ITShare\\Sessions\\Session4\\Files\\src\\com\\itshare\\files\\creation\\ahmed.txt");
			
			f.write("asdas");
			
			f.close();			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	file.delete();
		
		
	}

}
