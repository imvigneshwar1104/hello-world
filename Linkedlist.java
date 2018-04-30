package com.niit.New.Arrayproject;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Hello");
		obj.add("Abc");
		obj.add("Bye");
		obj.add("Hello");
		Iterator <String>itr=obj.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
