package sorting;

public class QuickSortPractice
{

	public static void main(String...s)
	{
		int testar[]= {3,1,4,11,1234,22,345,222,123,55,99,15};
		qucickSort(testar, 0,testar.length-1);
		for(int i: testar)
		{
			System.out.println(i);
		}
	}
	public static void qucickSort(int ar[],int lo,int hi)
	{
		if(lo>=hi)
		{
			return ;
		}
		int pidx=partitioing(ar, lo, hi);
		qucickSort(ar,lo,pidx-1);
		qucickSort(ar,pidx+1,hi);
	}
	public static int partitioing(int ar[],int lo,int hi)
	{
		int pidx=lo;
		int itr=lo;
		int pivot=ar[hi];
		while(itr<=hi)
		{
			if(ar[itr]>pivot)
			{
				itr++;
			}
			else 
			{
				swap(ar, pidx, itr);
				itr++;
				pidx++;
			}
		}
		return pidx-1;
	}
	
	public static void swap(int ar[],int i,int j)
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
}
