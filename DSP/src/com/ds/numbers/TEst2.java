package com.ds.numbers;

public class TEst2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int ar[]= {3,1,2,4};
		System.out.println(minimumSwaps(ar));
		System.out.println(ar);
		for(int i:ar)
		{
			System.out.println(i);
		}

	}

	static int count;
	public static void swap(int ar[], int i, int j) {
	        count++;
	        int temp = ar[i];
	        ar[i] = ar[j];
	        ar[j] = temp;
	    }
	    // Complete the minimumSwaps function below.
	    static int minimumSwaps(int[] arr) {

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

