package com.ds.practice;

public class CombineNumber2 {

	public static void main(String...s) {
		int ar[]= {0,1,2,0,1,2,0,1,2};
		
		int l=0,h=ar.length-1,mid=(l+h)/2;
		
		while(mid<ar.length)
		{
			
			if(ar[mid]==0)
			{
				int c=0;
				c=ar[l];
				ar[l]=ar[mid];
				ar[mid]=c;
				l++;
			}
			else if(ar[mid]==1)
			{
				//mid++;
				if(ar[l]==2)
				{
					mid--;
				}
				else if (ar[h]==0)
				{
					mid++;
				}
			}
			else if(ar[mid]==2)
			{
				int c=0;
				c=ar[mid];
				ar[mid]=ar[h];
				ar[h]=c;
				h--;
			}
			
			
//			else if(mid>=l)
//			{
//				if(ar[mid]==0)
//				{
//					int c=0;
//					c=ar[l];
//					ar[l]=ar[mid];
//					ar[mid]=c;
//					l++;
//				}
//				else	if(ar[mid]==2)
//				{
//				mid--;
//					h--;
//				}
//				else {
//					mid--;
//				}
//				
//			
//			}
			}
		for(int i:ar)
			System.out.print(i);
	}
}
