package recursions.quesans;

public class QueenAndBoxesPractice
{

	static int count;
	public static void main(String[] args)
	{
		rQueensInNBoxesPermutations(new boolean[4],2,0,"");
		System.out.println("total ways"+count);

	}

	public static void rQueensInNBoxesPermutations(boolean boxes[], int totalQueens, int qpsf,String asf)
	{
		if(totalQueens==qpsf)
		{
			System.out.println(asf);
			count++;
			return;
		}
		
		for(int i=0;i<boxes.length;i++)
		{
			if(!boxes[i])
			{
				boxes[i]=true;
				rQueensInNBoxesPermutations(boxes,totalQueens,qpsf+1,asf+" b"+i+" q"+qpsf);
				boxes[i]=false;
			}
		}
	}
}
