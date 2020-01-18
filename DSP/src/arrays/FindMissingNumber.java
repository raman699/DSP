package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMissingNumber
{
	public static void main(String... s)
	{
		int ar[]= {1,3,4,6};
		
		boolean arr[]=new boolean[ar.length+3];
		
		for(int i=0;i<ar.length;i++)
		{
			arr[ar[i]]=true;
			//System.out.println(ar[i]+" "+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" "+arr[i]);
		}
		IntStream st= Arrays.stream(ar);
		//Stream<Boolean> bs=Stream.generate(() -> Boolean.FALSE).limit(100);
		Stream<Boolean> stream = st.mapToObj(idx -> arr[idx]);
		//stream.forEach(x-> System.out.println(x));
		//Stream<Boolean> st= Arrays.stream(arr);
	}
}
