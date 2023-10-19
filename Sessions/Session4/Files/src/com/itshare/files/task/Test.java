package com.itshare.files.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		try {
			
			//creation
			File file = new File("D:\\work space\\Session4\\Files\\src\\com\\itshare\\files\\creation\\new.txt");

			Scanner scan = new Scanner(System.in);

			file.createNewFile();
			
			//writing
			FileWriter writer = new FileWriter(file,true);

			System.out.println("Enter your name : ");
			String name = scan.nextLine();
			writer.write(name);

			System.out.println("Enter your Age : ");
			String age = scan.nextLine();
			writer.write(age);

			System.out.println("Enter your Major : ");
			String major = scan.nextLine();
			writer.write(major);

			writer.close();
			
			
			//reading 
			
			Scanner scan2 = new Scanner(file);
			while(scan2.hasNextLine()) {
				System.out.println(scan2.next());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
