package arrays;

public class CheckMirrorInverse {

	public static void main(String[] args) {
		int ar[]= {3,4,2,0,1};
		boolean res=true;
		for(int i=0;i<ar.length;i++)
		{
			if((i!=ar[ar[i]]))
			{
				res=false;
				break;
			}
		}
		System.out.println(res);

	}

}
