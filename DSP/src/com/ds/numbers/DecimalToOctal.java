package com.ds.numbers;

public class DecimalToOctal {

	public static void main(String[] args) {
		int n=542;
		int rem=0;
		int power=1;
        int sum=0;
		while(n!=0)
		{
			rem=n%8;
			n=n/8;
			sum=sum+rem*power;
			power=power*10;
            
		}
		
		System.out.println(sum);

	}

}
