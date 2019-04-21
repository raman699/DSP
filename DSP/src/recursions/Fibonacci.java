package recursions;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibonacci(50));
		int n=43;
		System.out.println(fibonacciMemo(n,new int[n+1]));

	}

	public static int fibonacci(int n) {
		if (n == 0 || n==1) {
			return n;
		}
		
		int res = fibonacci(n - 1) + fibonacci(n - 2);
		return res;
	}

	public static int fibonacciMemo(int n, int strg[]) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibonacciMemo(n - 1,strg);

		int fnm2 = fibonacciMemo(n - 2,strg);
		
		int res = fnm1 + fnm2;
		strg[n] = res;
		return res;
	}
}
