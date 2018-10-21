package bitmask;

public class OffTheBit {

	public static void main(String[] args) {
		int n=57;
		int k=4;
		int bitmask=1<<k;
		int nbitmask=~bitmask;
		System.out.println(Integer.toBinaryString(n));
		int  num=(n&nbitmask);
		
		System.out.println(Integer.toBinaryString(num));
	}

}
