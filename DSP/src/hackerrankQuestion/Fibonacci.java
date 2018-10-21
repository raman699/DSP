package hackerrankQuestion;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, c = a + b;
		;
		int n = 10;
//nth series
		for (int i = 1; i <= 10; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
		}
		//to show one less loop till n-1
		//jb ye 10 ki liye chlega to 11th ki bhi calculation krke aayega.
		System.out.println(a);
	}

}
