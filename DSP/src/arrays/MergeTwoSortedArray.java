package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {


    public static void main(String...s)
    {
        int a[]={2,5,12,18,20};
        int b[]={7,9,11,15,25,28,30};

        Arrays.stream(getSortedArray(a,b)).forEach(s1 -> System.out.println(s1));
    }

    public static int[] getSortedArray(int []a, int b[])
    {
        if(a==null || a.length ==0)
        {
            return b;
        }
        if(b==null || b.length ==0)
        {
            return a;
        }
        int i=0,j=0,k=0;
        int res[]= new int[a.length + b.length];

        while(i<a.length && j<b.length) {

            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
            while(i<a.length) {
                res[k]=a[i];
                k++;
                i++;
            }
        while(j<b.length) {
            res[k]=b[j];
            k++;
            j++;
        }
        return res;
    }
}
