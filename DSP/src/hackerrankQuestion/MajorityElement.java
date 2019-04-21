package hackerrankQuestion;

public class MajorityElement
{

	public static void main(String... s)
	{
		int ar[] = { 3, 6, 6, 6, 6, 3, 3, 3, 3, 3 };

		int ce = -1, co = 0;
		for (int i = 0; i < ar.length; i++)
		{
			if (co == 0)
			{
				ce = ar[i];
				co++;
			}

			else if (co != 0 && ce == ar[i])
			{
				co++;
			} else if (co != 0 && ce != ar[i])
			{
				// ce = ar[i];
				co--;
			}

		}
		System.out.println(co);
		System.out.println(ce);
		if (co > 0)
		{
			System.out.println("There is a majoity element");
		} else
		{
			System.out.println("There is no majoity element");
		}
	}

}
