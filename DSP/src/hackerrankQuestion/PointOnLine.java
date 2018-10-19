package hackerrankQuestion;

import java.util.Scanner;

public class PointOnLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ar[] = new int[2 * n];

		for (int i = 0; i < 2 * n; i++) {
			ar[i] = sc.nextInt();
		}

		boolean xflag= check(ar,0,ar[0]);
		boolean yflag= check(ar,1,ar[1]);
		if(xflag||yflag)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static boolean check(int ar[], int vidx, int x) {
		if(vidx+1>ar.length)
		{
			return true;
		}
		
		boolean res= check(ar,vidx+2,x);
		if(res)
		{
			if(ar[vidx]==x)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}

		
	}
}
