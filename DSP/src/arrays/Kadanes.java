package arrays;

public class Kadanes {

	public static void main(String[] args) {
		int ar[]= {-10, -7, 1, 3, -4, 2};
		int csum=ar[0];
		int osum=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(csum +ar[i]>ar[i])//csum>0
			{
				csum+=ar[i];
			}
			else
			{
				csum=ar[i];
			}
            if(csum>osum)
            osum=csum;
		}
		System.out.println(osum);

	}

}
