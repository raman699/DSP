package recursions;

public class BoardRevise
{

	static int count;
	public static void main(String... s)
	{
		pbp(0, 10, "");
		System.out.println(count);
	}

	public static void pbp(int src, int des, String psf)
	{
		if (src == des)
		{
			System.out.println(psf);
			count++;
		}

		for (int dice = 1; dice <= 6; dice++)
		{
			if (src + dice <= des)
			{
				pbp(src + dice, des, psf + dice);
			}
		}
	}
}
