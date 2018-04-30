package com.niit.New.Arrayproject;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_Array= {11,12,13,14,15,16};
		
		System.out.println("Original Array:"+Arrays.toString(my_Array));
		
		int removeindex=1;
		
		for(int i=removeindex;i<my_Array.length -1;i++)
  
			 my_Array[i]=my_Array[i+1];
		
		System.out.println("After removing index:"+Arrays.toString(my_Array));
	}
  
}
 