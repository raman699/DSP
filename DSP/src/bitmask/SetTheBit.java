package bitmask;

public class SetTheBit {

	public static void main(String[] args) {
		int n=57;
		int k=2;
		int bitmask=1<<k;
		System.out.println(Integer.toBinaryString(n));
		int  num=(n|bitmask);
		
		System.out.println(Integer.toBinaryString(num));
	}

}
