package com.ds.numbers;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=111001;
		int rem=0;
		int power=1;
		double number=0;
        int sum=0;
		while(n>=1)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem*power;
			power=power*2;
            
		}
		
		System.out.println(sum);

	}

}
