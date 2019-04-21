package recursions;

import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {
		ArrayList<String> al= getBoard1(0,10);
		System.out.println(al);
		System.out.println(al.size());

	}

	public static ArrayList<String> getBoard(int src,int des)
	{
		if(des==1)
		{
			ArrayList<String>  al=new ArrayList<String>();
			al.add("1");
			return al;
		}
		
		ArrayList<String> recRes= getBoard(src,des-1);
		ArrayList<String> myRes=new ArrayList<String>();
		for(String val:recRes)
		{}
		
		//myRes.addAll(recRes);
		return myRes;
	}
	
	public static ArrayList<String> getBoard1(int src,int des)
	{
		if(src==des)
		{
			ArrayList<String> al = new ArrayList<String>();
			al.add("");
			return al;
		}
		
		if(src>des)
		{
			ArrayList<String> al = new ArrayList<String>();
			
			return al;
		}
		
		ArrayList<String> myResult= new ArrayList<String>();
		
		for(int i=1;i<=6;i++)
		{
			int inter= src+i;
			
			ArrayList<String> recRes= getBoard1(inter,des);
			
			for(String  val :recRes)
			{
				myResult.add(i+val);
			}
		}
		
		return myResult;
	}
}
