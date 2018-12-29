package sorting;

public class QucikSort {

	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr1[] = { 2, 25, 10, 16, 18, 1, 17 };
		int arr[]= {7,1,3,2,4,5,6};
		int ar2[]= {0,0,0,1,2,2,1,0,1};
		//int i = partioning(arr);
		quickSort(arr,0,(arr.length-1));
		//sort012(ar2);
		display(arr);
		System.out.println(count);
	}

	public static int partioning(int[] arr) {

		int pivot = arr[arr.length - 1];

		int i = 0;
		int pidx = 0;

		while (i < arr.length) {
			if (arr[i] <= pivot) {
				swap(arr, i, pidx);
				pidx++;
				i++;

			} else {
				i++;
			}
		}
		return pidx - 1;
	}
	
	public static int partioningQ(int[] arr,int lo,int hi,int pivot) {
		int i = lo;
		int pidx = lo;

		while (i <= hi) {
			if (arr[i] <= pivot) {
				swap(arr, i, pidx);
				pidx++;
				i++;

			} else {
				i++;
			}
		}
		return pidx - 1;
	}

	
	public static void swap(int ar[], int i, int j) {
		count++;
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void display(int ar[]) {
		for (int i : ar) {
			System.out.println(i);
		}
	}
	
	public static void quickSort(int arr[],int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		int pivot=arr[hi];
		int pidx=partioningQ(arr,lo,hi,pivot);
		quickSort(arr,lo,pidx-1);
		quickSort(arr,pidx+1,hi);
	}
	
	public static void sort012(int ar[])
	{
		int z=0; // 0---z-1
		int o=0; // 1 ka area
		int t=0; //2 ka area
		
		while(t<ar.length)
		{
			if (ar[t]==2)
			{
				t++;
			}
			else if(ar[t]==1)
			{
				swap(ar,t,o);
				t++;
				o++;
			}
			else if(ar[t]==0)
			{
				swap(ar,t,o);
				t++;
				swap(ar,o,z);
				o++;
				z++;
			}
		}
	}
	
	public static void swap1(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
