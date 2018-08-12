package strings;

public class SubSequence {

	public static void main(String[] args) {
		String str = "abcd";
 // if you have to calculate the power of 2 
		//means doubling you can use 1<<str.length()
		//0001=1
		//0010=2
		//0100=4
		//1000=8
		for (int i = 0; i < (1<<str.length()); i++) {

			for (int c = str.length()-1; c >= 0; c--) {
				int bitmask = 1 << c;

				if ((i & bitmask) == bitmask) {
					
					System.out.print(str.charAt(str.length()-1-c));
				} 
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
