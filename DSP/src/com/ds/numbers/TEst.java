package com.ds.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TEst
{

	public static void main(String[] args)
	{
		BigDecimal l= new BigDecimal(2);
		System.out.println(l.pow(64));
		System.out.println(Long.MAX_VALUE);
		long h=1<<1;
		System.out.println(h);
		long l1 =1<<30;
		//long l2=1<<31;
		System.out.println(l1);
		//System.out.println(l2);
		//System.out.println(l1+l2);
		System.out.println(l1+l1);
		Long  j=new Long(1<<31);
		System.out.println(j);
		long kk=9223372036854775807l;
		System.out.println(kk);
		System.out.println(1<<61);

	}
	
	public static void findDecimalFromBinary(int ar[])
	{
		
	}

}
