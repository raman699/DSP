package hackerrankQuestion.goldman;

public class Q1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int res = get(5, 2, 1);
		System.out.println(4%5);

	}

	public static int get(int n, int t, int d)
	{
		int i = d;
		while (t > 0)
		{
			i = (i + 1) % n;
			// i++;
			t--;
		}
		return i - 1;
	}

}
