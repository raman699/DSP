package arrays;

public class SlectionSort {

	public static void main(String[] args) {
		int[] ar= {5,4,3,2,1};
		
		for(int j=0;j<ar.length-1;j++) {
			for(int i=j+1;i<ar.length;i++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		for(int show:ar)
		{
			System.out.println(show);
		}

	}

}
