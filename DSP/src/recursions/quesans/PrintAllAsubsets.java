package recursions.quesans;

public class PrintAllAsubsets
{

	public static int counter;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		printAllSubSets(0," ",2,3,4);
		System.out.println(counter);

	}
	
	public static void printAllSubSets(int vidx, String set,int ...ar)
	{
		if(vidx==ar.length)
		{
			System.out.println(set);
			counter++;
			return;
		}
		printAllSubSets(vidx+1, set+ar[vidx]+" ", ar);
		printAllSubSets(vidx+1, set, ar);
	}

}
