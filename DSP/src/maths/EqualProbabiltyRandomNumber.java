package maths;

public class EqualProbabiltyRandomNumber
{

	public static void main(String... s)
	{

	}

	int getEqualProbabiltyRandomNumber()
	{
		int x = random();
		int y = random();
		return (2 * x) - (y & 1);
	}

	static int random()
	{
		return (int) ((Math.random() % 6) + 1);
	}
}
