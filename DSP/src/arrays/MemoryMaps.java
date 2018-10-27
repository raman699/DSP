package arrays;

public class MemoryMaps {

	public static void main(String...s)
	{
		int i=90;
//		int j=56;
//		System.out.println(i+"  "+j);
//		swap(i,j);
//		System.out.println(i+"  "+j);
        int ar[]= {90,56};

//		System.out.println(ar[0]+"  "+ar[1]);
//		swap(ar[0],ar[1]);
//		System.out.println(ar[0]+"  "+ar[1]);
//        System.out.println("array swap");
		System.out.println(ar[0]+"  "+ar[1]);
		arraySwap(ar,0,1);
		System.out.println(ar[0]+"  "+ar[1]);

	}
	public static void swap(int i,int j)
	{
		int k=0;
		k=i;
		i=j;
		j=k;
	}
	public static void arraySwap(int ar[],int i,int j)
	{
		int k=ar[i];
		ar[i]=ar[j];
		ar[j]=k;
		
	}
}
