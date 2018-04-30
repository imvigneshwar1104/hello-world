package com.niit.New.Arrayproject;
import java.util.*;
public class Array2 {


public static void main(String arg[])
{
ArrayList<String> obj = new ArrayList<String>();//typeOf
obj.add("Rahul");
obj.add("Vikas");
obj.add("Asif");
obj.add("39.23");
obj.add("Vikas");// duplicate value is not allowed
// maintains order of insertion
// works as single linked list{dynamic array}
Iterator <String>itr = obj.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}

}

}

