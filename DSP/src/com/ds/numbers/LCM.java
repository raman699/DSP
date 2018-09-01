package com.ds.numbers;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int divis = num1, divid = num2, rem = num2%num1;
		while (rem != 0) {
			divid = divis;
			divis = rem;		
			rem = divid % divis;
		}
		System.out.println(divis);
		int LCM= (num1*num2)/divis;

	}

}
