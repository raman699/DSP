package com.ds.numbers;

public class OctalToDecimal {

	public static void main(String[] args) {
		int n=1036;
		int rem=0;
		int power=1;
        int sum=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem*power;
			power=power*8;
            
		}
		
		System.out.println(sum);

	}

}
