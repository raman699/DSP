package com.ds.numbers;

public class Addition {

	public static void main(String[] args) {
		int n1 = 13;
		int n2 = 12;
		int b = 10;
		int carry = 0;
		int sum = 0;
		int power = 1;
		
		while (n1 != 0 || n2 != 0) {
			int a1 = n1 % 10;
			int a2 = n2 % 10;

			int s = a1 + a2 + carry;
			int rem = s % b;
			carry = s / b;
			sum = sum + rem * power;
			power = power * 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
		}
	if(carry>0)
	{
		sum=sum+carry*power;
	}
		System.out.println(sum);
	}

}