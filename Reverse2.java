package com.threetyape.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reverse2 {
	
	public static void main(String[] args) {
		String s1="myjavaclass";
		char[] ary=s1.toCharArray();
		
		List<Character>l1=new ArrayList<>();
		for (char cha : ary) 
			l1.add(cha);
			
			Collections.reverse(l1);
			ListIterator litr=l1.listIterator();
			while (litr.hasNext()) {
                System.out.print(litr.next());				
			}
		
		
		
		
	} 
}
