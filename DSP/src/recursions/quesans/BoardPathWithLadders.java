package recursions.quesans;

public class BoardPathWithLadders
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static void printBoardPath16OpeningWithLadders(int src, int des, String asf, int ladders[])
	{
		if (src == des)
		{
			System.out.println(asf);
			return;
		}
		if (src > des)
		{
			return;
		}

		if (src == 0)
		{
			printBoardPath16OpeningWithLadders(src + 1, des, asf + 1, ladders);
			printBoardPath16OpeningWithLadders(src + 1, des, asf + 6, ladders);
		} else if (ladders[src] != 0)
		{
			printBoardPath16OpeningWithLadders(ladders[src], des, asf + ladders[src], ladders);
		} else
		{
			for (int dice = 1; dice <= 6; dice++)
			{
				printBoardPath16OpeningWithLadders(src + dice, des, asf + dice, ladders);
			}
		}
	}

}
