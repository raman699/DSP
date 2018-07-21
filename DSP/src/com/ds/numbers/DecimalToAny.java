package com.ds.numbers;

import java.util.Scanner;

public class DecimalToAny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("enter  the base ");
		int db = sc.nextInt();
		convert(num,db);
	}

	static void convert(int num, int db) {

		int sum=0;
		int power=1;
		int rem=0;
		
		while(num!=0)
		{
			rem=num%db;
			num=num/db;
			sum=sum+rem*power;
			power=power*10;
		}
		System.out.println(sum);
		}
	}
