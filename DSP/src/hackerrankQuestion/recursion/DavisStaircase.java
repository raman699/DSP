//https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking
package hackerrankQuestion.recursion;

public class DavisStaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getTotalWays(0,10,new int[11]));

	}

	public static int getTotalWays(int s, int d, int qb[])
	{
		if(s>d)
		{
			return 0;
		}
		if(s==d)
		{
			return 1;
		}
		
		if(qb[s]!=0)
        {
            return qb[s];
        }
			int cstod=0;
			
			for(int sh=1;sh<=3;sh++)
			{
				int i=s+sh;
				int citod=getTotalWays(i, d,qb);
				cstod+=citod;
			}
			qb[s]=cstod;
			return cstod;
	}
}
