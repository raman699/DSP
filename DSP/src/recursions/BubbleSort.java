package recursions;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[]= {22,33,1,2,3};
		bubbleSort(ar,0, ar.length-1);
		for(int i:ar)
		{
			System.out.println(i);
		}

	}

	public static void bubbleSort(int ar[],int si,int li)
	{
		if(li==0)
		{
			return;
		}
		if(si==li)
		{
			bubbleSort(ar, 0, li-1);
			return;
		}
		if(ar[si]>ar[si+1])
		{
			int temp=ar[si];
			ar[si]=ar[si+1];
			ar[si+1]=temp;
		}
		bubbleSort(ar, si+1, li);
	}
}
