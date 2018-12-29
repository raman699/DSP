package hackerrankQuestion.arrays;

import java.util.Arrays;

public class NewYearChaos {

	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1 ,2, 5 ,3 ,7 ,8 ,6 ,4};
		//findNumBribes(arr);
		minimumBribes(arr);
		System.out.println(count);

	}

	public static int findNumBribes(int arr[]) {

		boolean check=false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == i + 1) {
				continue;
			} else if (arr[i] == i + 2) {
				count++;
			} else if (i + 3 <= arr.length && arr[i] == i + 3) {
				count += 2;
			}
//			else if(arr[i]-(i+1) > 2)
//			{
//				System.out.println("Too ch");
//				break;
//			}
			//good logic 
			if(arr[i]-(i+1) > 2)  //difference can be -ve also so iit would work even the elements have moved in wrong direction
            {               
                check = true;
                break;     
            }
		//	bubbleSort(arr);
//            for (int j = Math.max(0, arr[i]-1-1); j < i; j++)
//                if (arr[j] > arr[i]) 
//                    count++;
		}

		 if(check)
	            System.out.println("Too chaotic");
	        else
	            System.out.println(count);
		return count;
	}

	public static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j + 1] < ar[j]) {
					count++;
					swap(ar, j, j + 1);
				}
			}
		}

	}

	public static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	static void minimumBribes(int[] A) 
	{
	    int n = A.length;
	    int cnt = 0;
	    for(int i = n - 1; i >= 0; i--)
	    {
	        if(A[i] != (i + 1))
	        {
	            if(((i - 1) >= 0) && A[i - 1] == (i + 1))
	            {
	                cnt++;
	                swap(A,i, i-1);
	            }
	            else if(((i - 2) >= 0) && A[i - 2] == (i + 1))
	            {
	                cnt += 2;
	                A[i - 2] = A[i - 1];
	                A[i - 1] = A[i];
	                A[i] = i + 1;
	            }
	            else
	            {
	                System.out.println("Too chaotic\n");
	                return;
	            }
	        }      
	    }
	    System.out.println(cnt);
	    return;
	}
}
