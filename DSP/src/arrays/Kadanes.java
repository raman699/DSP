package arrays;

public class Kadanes {

	public static void main(String[] args) {
		int ar[]= {2,3,-6,1,2,3,-4,5};
		int csum=ar[0];
		int osum=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(csum +ar[i]>ar[i])
			{
				csum+=ar[i];
				osum=csum;
			}
			else
			{
				csum=ar[i];
				osum=ar[i];
			}
			
		}
		System.out.println(osum);

	}

}
