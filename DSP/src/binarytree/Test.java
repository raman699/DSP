package binarytree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method s		
		Boolean b = new Boolean("false");
		
		Double d = new Double("17.46d");
		
	//	Integer i= new Integer();
		
		Float f= new Float(23.43);
		
	// c= new Character("C");
		System.out.println(b+""+d+f);
		
		Set<String> s= new LinkedHashSet<String>();
		
		s.add("3");
		s.add("1");
		s.add("3");
		s.add("2");
		s.add("3");
		s.add("1");
		for(String se:s)
		{
			System.out.println(se);
		}
		
		String str1="My String";
		String str2=new String("My String");
		
		System.out.println(str1==str2);
		//System.out.println(String.pa);
		System.out.println(str1.hashCode()==str2.hashCode());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.matches(str2));
		 SortedSet<Integer> ss = new TreeSet<>(); 
		  
	        // Trying to access element from 
	        // empty set 
	    //    try { 
		 ss.add(15);
		 ss.add(10);
		 ss.add(25);
		 ss.add(10);
		 
	            System.out.println(ss.first());
	            System.out.println(ss.size());
	     //   } 
//	        catch (Exception e) { 
//	            // throws NoSuchElementException 
//	            System.out.println("Exception: " + e); 
//	        } 
	            
	            int max = 10; 
	            int min = 1; 
	            int range = max - min + 1; 
	      
	            // generate random numbers within 1 to 10 
	            for (int i = 0; i < 10; i++) { 
	                int rand = (int)(Math.random() % range) + min; 
	      
	                // Output is different everytime this code is executed 
	                System.out.println(rand); 

	}
	}
}
