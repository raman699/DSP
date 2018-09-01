package recursions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=factorial(5);
		System.out.println(fact);
	}

	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		 int fnm1=factorial(n-1);
		 int fm=n*fnm1;
		 return fm;
	}
}
