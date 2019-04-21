package sorting;

public class MergeSortPractice
{

	public static void main(String...s)
	{
		int testar[]= {3,1,4,11,1234,22,345,222,123,55,99,15};
		int resar[]= mergeSort(testar, 0,testar.length-1);
		for(int i: resar)
		{
			System.out.println(i);
		}
	}
	public static int[] mergeSort(int ar[], int lo, int hi)
	{
		if (lo >= hi)
		{
			return new int[] { ar[lo] };
		}
		int mid = (lo + hi) / 2;
		int fhalf[] = mergeSort(ar, lo, mid);
		int shalf[] = mergeSort(ar, mid + 1, hi);

		int resarr[] = merge(fhalf, shalf);

		return resarr;

	}

	public static int[] merge(int[] first, int second[])
	{
		int n1 = first.length;
		int n2 = second.length;
		int n3 = n1 + n2;

		int third[] = new int[n3];
		int i = 0, j = 0;
		for (int k = 0; k < n3; k++)
		{
			if (i < n1 && j < n2)
			{
				if (first[i] < second[j])
				{
					third[k] = first[i];
					i++;
				} else
				{
					third[k] = second[j];
					j++;
				}

			} else if (i < n1)
			{
				third[k] = first[i];
				i++;
			} else if (j < n2)
			{
				third[k] = second[j];
				j++;
			}

		}
		return third;
	}
}
