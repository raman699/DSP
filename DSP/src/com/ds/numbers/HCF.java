package com.ds.numbers;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int divis = 0, divid = 0, rem = num1;
		divis = num1 < num2 ? num1 : num2;
		divid = num1 > num2 ? num1 : num2;
		while (rem != 0) {
			rem = divid % divis;
			if (rem != 0) {
				divid = divis;
				divis = rem;
			}


		}
		System.out.println(divis);

	}

}
