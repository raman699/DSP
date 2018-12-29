package recursions;

//his is decreasing /increasing
public class IncreasingDecreasing {

	public static void main(String[] args) {
		printIncreasingDecreasing(7);

	}

	// Expectation= for n=4 -- 4 3 2 1 1 2 3 4
	// Faith it will work for N=3 3 2 1 1 2 3
	// HLL code for n=4 PID(4)= 4 PI(3) 4
	// Base Condition n==0
	public static void printIncreasingDecreasing(int n) {
		if (n == 0) {
			return;
		}

		System.out.print(n + " ");
		printIncreasingDecreasing(n - 1);
		System.out.print(n + " ");
	}

	// E for n=8 --- 7 5 3 1 2 4 6 8
	// F it will work for N= 7 5 3 1 2 4 6
	// HLL if n 8 P(7) 8
	//HLL if n P(7) P 
	// if n odd PI
	public static void test2(int n) {

		if (n == 0) {
			return;
		}

		if (n % 2 != 0) {
			System.out.println(n);
		}
		test2(n - 1);
		if (n % 2 == 0) {

			System.out.println(n);
		}

	}
}
