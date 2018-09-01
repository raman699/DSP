package recursions;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gpower(2,5));

	}

	public static int power(int x,int n)
	{
		
     if(n==0)
     {
    	 return 1;
     }
		int r=x*power(x,n-1);
     
		return r;
	}
	public static int gpower(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		int temp=gpower(x,(n/2));
		int res = temp *temp;
		//return res;
		if(n%2==0)
		{
			return res;
		}
		else
		{
			return res*x;	
		}
		
	}
}

//E(5,4) 625

//F(5,3) 