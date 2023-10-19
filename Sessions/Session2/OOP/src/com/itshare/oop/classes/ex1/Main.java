package com.itshare.oop.classes.ex1;


public class Main {

	public static void main(String[] args) {

		
		CVTemplate object = new CVTemplate();
		object.name = "ahmed";
		object.education =" cairo university";
		object.experience=" 1 year ";
		object.summary="he is junior";
		
		
		
		System.out.println(object.name);
		System.out.println(object.education);
		System.out.println(object.experience);
		System.out.println(object.summary);

		System.out.println("---------------------------------------------");

		
		CVTemplate object2 = new CVTemplate();

		object2.name = "omar";
		object2.education =" MSA university";
		object2.experience=" 2 year ";
		object2.summary="he is junior";

		System.out.println(object2.name);
		System.out.println(object2.education);
		System.out.println(object2.experience);
		System.out.println(object2.summary);

		
	}

}
