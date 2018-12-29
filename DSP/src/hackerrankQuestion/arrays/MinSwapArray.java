package hackerrankQuestion.arrays;

public class MinSwapArray {

   static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,3,2,4,5,6};
		int ar1[]= {4,3,1,2};
		System.out.println(getMinSwap(ar1));
	}

	public static void swap(int ar[], int i, int j) {
		count++;
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	public static int  getMinSwap(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			while(arr[i]!=i+1)
			{
				swap(arr,i,arr[i]-1);
			}
		}
		return count;
	}
}
