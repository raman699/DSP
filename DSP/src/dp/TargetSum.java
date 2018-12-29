package dp;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,3,4};
		System.out.println(targetSum(arr, 7));
		System.out.println(subSetSum(arr,7));

	}

	public static boolean targetSum(int arr[], int target) {

		int rows = arr.length + 1;
		int col = target + 1;
		boolean strg[][] = new boolean[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0) {
					strg[i][j] = true; //0 ko bnane ka 1 way kuch bhi na dalo tabhi true kra
				} else if (j == 0) {
					strg[i][j] = false;
				} else {

					int valueFromAr = arr[i - 1];
					if (valueFromAr == j) {
						strg[i][j] = true;
					} else {
						int prevr = i - 1;
						int prevc = j - valueFromAr;
						if(prevc>=0 && strg[prevr][prevc])
						{
							strg[i][j]=true;
						}
						else
						{
							strg[i][j]=strg[i-1][j];
						}
					}
				}
			}
		}
		return strg[rows-1][col-1];
	}
	public static boolean subSetSum(int arr[], int sum)
	{
		//storage
		int rows=arr.length;
		int col=sum+1;
		boolean strg[][]=new boolean[rows][col];
		//smaller problem
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<sum;j++)
			{
				if(j==0)
				{
					strg[i][j]=true;
				}
			}
		}
		//traverse
		for(int i=0;i<rows;i++)
		{
			for(int j=1;j<col;j++)
			{
				if(arr[i]>j)
				{
					strg[i][j]=false;
				}
				else if((i>=1 &&strg[i-1][j])|| (i>=1 && j-arr[i]>=0 &&strg[i-1][j-arr[i]]))
				{
					strg[i][j]=true;
				}
				else if (j==arr[i])
				{
					strg[i][j]=true;
				}
			}
		}
		return strg[rows-1][col-1];
	}
}
