package hackerrankQuestion.goldman;

public class ZeroOneFlip
{

	public static void main(String[] args)
	{
		int ar[] = { 1, 0, 1 };
		int ar1[] = { 1, 0, 1, 0,1 };

		long answer = getDistinctNumberOfNum(ar);
		long answer2 = getDistinctNumberOfNum(ar1);

		System.out.println(answer + " " + answer2);
	}

	public static long getDistinctNumberOfNum(int ar[])
	{
		int countZero = 0;
		int countOne = 0;

		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] == 0)
			{
				countZero++;
			} else
				countOne++;
		}
		long denom = countZero < countOne ? factorial(countZero, new long[countZero + 1])
				: factorial(countOne, new long[countOne + 1]);

		int ivar = countZero > countOne ? countZero : countOne;
		int numf = 1;
		for (int i = ivar + 1; i <= ar.length; i++)
			numf = numf * i;

		return (numf / denom);
	}

	public static long factorial(int n, long qb[])
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}
		if (qb[n] != 0)
		{
			return qb[n];
		}

		long fact = n * factorial(n - 1, qb);
		qb[n] = fact;
		return fact;
	}
//	Stream<Integer> num = Stream.iterate(1, n -> n + 1).limit(5);
//	Integer numf = num.reduce(1, (a, b) -> a * b);
//	System.out.println(numf);

//	Stream<Integer> num = Stream.iterate(countZero > countOne ? countZero + 1 : countOne + 1, n -> n + 1)
//			.limit(ar.length);
//
//	num.forEach(n -> System.out.println(n));
//	Integer numf = num.reduce(1, (a, b) ->
//	{
//		System.out.println(a);
//		return a * b;
//	});
}
