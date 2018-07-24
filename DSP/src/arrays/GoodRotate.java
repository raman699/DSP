package arrays;

public class GoodRotate {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int k=2;
		reverse(ar,ar.length-k,ar.length-1);
		reverse(ar,0,ar.length-k-1);
		reverse(ar,0,ar.length-1);
		for(int show:ar)
		System.out.println(show);

	}

	public static void reverse(int ar[],int i,int j)
	{
		int lo=i;
		int hi=j;
		while(lo<=hi)
		{
			int k=ar[lo];
			ar[lo]=ar[hi];
			ar[hi]=k;
			lo++;
			hi--;
		}
	}
}
