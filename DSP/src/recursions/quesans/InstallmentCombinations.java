package recursions.quesans;

public class InstallmentCombinations
{
	static int count;

	public static void main(String[] args)
	{
		coincombinations(new int[] {2,3,5,6},10,0,"");
		count=0;
		System.out.println();
		coinpermutationss(new int[] {2,3,5,6},10,0,"");
	}

	public static void coincombinations(int denoms[],int amt,int lpi,String asf)
	{
		if(amt==0)
		{
			count++;
			System.out.println(count+" "+asf);
			return;
		}
		
		for(int i=lpi;i<denoms.length;i++)
		{
			if(amt >=denoms[i])
			coincombinations(denoms, amt-denoms[i], i, asf +denoms[i]);
		}
	}
	
	public static void coinpermutationss(int denoms[],int amt,int lpi,String asf)
	{
		if(amt==0)
		{
			count++;
			System.out.println(count+" "+asf);
			return;
		}
		
		for(int i=0;i<denoms.length;i++)
		{
			if(amt >=denoms[i])
				coinpermutationss(denoms, amt-denoms[i], i, asf +denoms[i]);
		}
	}
}
