package bitmask;

public class BitOnOFF {

	public static void main(String[] args) {
		int n=64;
		int k=3;
		int bitmask=1<<k;
		System.out.println(Integer.toBinaryString(n));
		
		if((n&bitmask)==bitmask)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
			

	}

}
