package com.example.PWDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1="pw";
		String s2="pw";
		String s3=new String ("Pwskills");
		String s4=new String ("Pwskills");
		
		if (s1==s2) 
			System.out.println("s1 and s2 refers to same object");
		else
			System.out.println("s1 and s2 not refers to same object");
		if (s3==s4)
			System.out.println("s3 and s4 refers to same object");
		else 
			System.out.println("s3 and s4 not refers to same object");

	}

}
