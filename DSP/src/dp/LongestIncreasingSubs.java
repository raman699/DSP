package dp;

public class LongestIncreasingSubs {

	static String LDS[];
	static String LIS[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
		int g = longestIncreasingSub(ar);

		int d = longestDecreasingSub(ar);

		for(int i=0;i<ar.length;i++)
		{
			System.out.println(LIS[i]+"--"+LDS[i]);
		}

	}
//storage==arr.length wala
//meaning==till that index the longest increasing subs ending there
//traversal==small--high
//result=max 
	
	//agar hme dip wala question hota to hm ulta jate or khte yaha se shuru hone wala LIS
	public static int longestIncreasingSub(int arr[]) {

		int strg[] = new int[arr.length];

		strg[0] = 1;

		LIS = new String[arr.length];
		LIS[0] = "" + arr[0];
		for (int i = 1; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && strg[j] > max) {
					max = strg[j];
					LIS[i] = LIS[j] + ">" + arr[i];
				}
			}
			if(max==0)
            {
            	LIS[i]=""+arr[i];
            }
			strg[i] = max + 1;
			//System.out.println(strg[i]);
		}
		for (String i : LIS) {
			//System.out.println(i);
		}
		int max = 0;
		for (int i : strg) {
			// System.out.println(i);
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
//this is ulta decreasing
	public static int longestDecreasingSub(int arr[]) {

		int strg[] = new int[arr.length];

		strg[arr.length - 1] = 1;

		LDS = new String[arr.length];
		LDS[arr.length - 1] = "" + arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			int longs = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i] && strg[j] > longs) {
					longs = strg[j];
					LDS[i] = LDS[j] + "<" + arr[i];
				}
			}
            if(longs==0)
            {
            	LDS[i]=""+arr[i];
            }
			strg[i] = longs + 1;

			// System.out.println(strg[i]);
		}
		for (String i : LDS) {
			//System.out.println(i);
		}
		int max = 0;
		for (int i : strg) {
			// System.out.println(i);
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
