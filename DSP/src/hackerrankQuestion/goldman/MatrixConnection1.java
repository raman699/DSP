package hackerrankQuestion.goldman;

public class MatrixConnection1
{

	public static void main(String... s)
	{
		int ar[][] = { { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 0, 1 },
				// {0,0,0,0}
		};
		int res = getValidConnections(ar);
		System.out.println(res);
	}

	public static int getValidConnections(int ar[][])
	{
		int count = 0;
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[0].length; j++)
			{

				if (ar[i][j] == 1)
				{

					if (i + 1 < ar.length)
					{
						if ((ar[i][j] == ar[i + 1][j]))
						{
							count++;
						}
						if (j + 1 < ar[0].length && (ar[i][j] == ar[i + 1][j + 1]))
						{
							count++;
						}
						if (j - 1 >= 0 && (ar[i][j] == ar[i + 1][j - 1]))
						{
							count++;
						}
					}

					if (j + 1 < ar[0].length && (ar[i][j] == ar[i][j + 1]))
					{
						count++;
					}
				}

			}
		}
		return count;
	}
}
