package com.ds.numbers;

import java.util.Scanner;

public class AnyToAny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num = sc.nextInt();
		System.out.println("enter  the base ");
		int db = sc.nextInt();
	
		System.out.println("enter  the destination  base ");
		int db2 = sc.nextInt();
		
		DecimalToAny.convert(AnyToDecimal.anyToDecimal(num, db), db2);

	}

}
