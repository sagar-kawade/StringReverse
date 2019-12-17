package com.threetyape.string;

import java.util.Scanner;

public class Reverse4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1;
		System.out.println("Enter string...");
		s1=sc.next();
StringBuffer sbuff=new StringBuffer();
	sbuff.append(s1);
		System.out.print(sbuff.reverse());
		
	}
	
}
