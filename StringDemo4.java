package com.example.PWDemo;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1= "ASDF";
		String s2= new String("ASDF");
		String s3= new String("AsDF");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}
}
