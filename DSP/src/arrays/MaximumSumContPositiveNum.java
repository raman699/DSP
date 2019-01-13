package arrays;

import java.util.Scanner;

public class MaximumSumContPositiveNum
	{
		public static void main(String[] args)
			{
				int curSum = 0, maxSum = -1;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the length of Array");
				int n = sc.nextInt();
				int ar[] = new int[n];
				System.out.println("Enter the array Elements");
				for (int i = 0; i < n; i++)
					{
						ar[i] = sc.nextInt();
					}
				for (int idx = 0; idx < n; idx++)
					{
						if (ar[idx] >= 0)
							{
								curSum = curSum + ar[idx];
								if (curSum > maxSum)
									{
										maxSum = curSum;
									}
							} else
							{
								curSum = 0;
							}
					}
				System.out.println("Maximum Sum of a Set of Contagious Positive Number in an Array is " + maxSum);
			}

	}
