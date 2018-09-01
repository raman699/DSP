package recursions;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(10));

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}
		int res = fibonacci(n - 1) + fibonacci(n - 2);
		return res;
	}
}
