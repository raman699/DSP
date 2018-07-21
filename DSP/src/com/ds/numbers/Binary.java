package com.ds.numbers;

public class Binary {

	public static void main(String[] args) {
		int n=57;
		int rem=0;
		int power=1;
		double number=0;
        int sum=0;
		while(n>=1)
		{
			rem=n%2;
			n=n/2;
			sum=sum+rem*power;
			power=power*10;
            
		}
		
		System.out.println(sum);
	}

}
