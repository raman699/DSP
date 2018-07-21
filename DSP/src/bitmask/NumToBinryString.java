package bitmask;

public class NumToBinryString {

	public static void main(String[] args) {
		int n=-200;
		System.out.println(Integer.toBinaryString(n));

		
		for(int k=31;k>=0;k--)
		{
			int bitmask=1<<k;
		
			if((n&bitmask)==bitmask)
			{
				  System.out.print(1);
			}
			else
			{
				System.out.print(0);
			}
			
			}
		//System.out.println(Integer.toBinaryString(n));
		
		}
	}


