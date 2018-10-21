package hackerrankQuestion;

public class Card {

	public static void main(String[] args) {
		int ar[]= {5,6,7,4,8,9};
        System.out.println(check(ar));
	}
	
	public static boolean check(int[] ar)
	{
		int i=0;
		int max=ar[0];
		while(i<ar.length)
		{
			if(ar[i]<max)
			{
				break;
			}
			else
			{
				max=ar[i];
			}
			i++;
		}
		int temp=i-1;
		int min=ar[i];
		int j=i;
		int count=0;
		while(j<ar.length)
		{
			if(ar[j]<min)
			{
				break;
			}
			else
			{
				min=ar[j];
				count++;
			}
			j++;
		}
		
		return temp+count==ar.length-1?true:false;
	}

}
