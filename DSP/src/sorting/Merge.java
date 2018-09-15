package sorting;

public class Merge {

	public static void main(String... s) {

//		int one[]= {10,15,18,22,27};
//		int two[]= {5,6,16,23,28,40,50};
//		int three[]=merge(one,two);
		
		int array[]= {2,3,4,-1,33,22,11,34};
		array=mergeSort(array,0,array.length-1);
		display(array);
	}

	public static void display(int ar[]) {
		for (int i : ar) {
			System.out.println(i);
		}
	}
	public static int[] merge(int one[], int two[]) {
		int n1 = one.length;
		int n2 = two.length;
		int n3 = n1 + n2;

		int three[] = new int[n3];
		int i = 0, j = 0;
		for (int k = 0; k < n3; k++) {

			if(i<n1&&j<n2)
			{
				if(one[i]<two[j])
				{
					three[k]=one[i];
					i++;
				}
				else
				{
					three[k]=two[j];
					j++;
				}
			}
			else if(j<n2)
			{
				three[k]=two[j];
				j++;
			}
			else if(i<n1)
			{
				three[k]=one[i];
				i++;
			}
		}
		return three;
	}
	public static int[] mergeSort(int ar[],int lo,int hi)
	{
		
		if(lo==hi)
		{
			int [] ba= new int[1];
			ba[0]=ar[lo];
			return ba;
		}
		int mid=(lo+hi)/2;
		int[] fhalf=mergeSort(ar,lo,mid);
		int [] shalf=mergeSort(ar,mid+1,hi);
		int res[]=merge(fhalf,shalf);
		
		return res;
	}
}
