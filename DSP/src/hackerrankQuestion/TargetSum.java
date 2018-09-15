package hackerrankQuestion;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,2,3,4,6,7};
		int i=0;
		int l=ar.length-1;
		int sum= 7;
		while(i<=l)
		{
			if(ar[i]+ar[l]==sum)
			{
				System.out.println(ar[i]+" "+ar[l]);
				i++;
				l--;
			}
			else if(ar[i]+ar[l]>sum)
			{
				l--;
			}
			else if(ar[i]+ar[l]<sum)
			{
				i++;
			}
		}

	}


}
