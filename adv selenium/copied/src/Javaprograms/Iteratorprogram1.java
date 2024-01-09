package Javaprograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratorprogram1 
{


	public static void main(String[] args) 
	{
   ArrayList l1=new ArrayList();
   l1.add(10);
   l1.add(20.7);
   l1.add(true);
   l1.add("Hi");
  ListIterator itr = l1.listIterator();
   while(itr.hasNext())
   {
	 Object obj = itr.next();  
	 System.out.println(obj);
   }
   while(itr.hasPrevious())
   {
	 Object obj = itr.previous();  
	 System.out.println(obj);
   }
	}

}
