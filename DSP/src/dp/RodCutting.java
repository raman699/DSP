package dp;

public class RodCutting {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {0,3,5,6,15,10,25,12,24};
		System.out.println(rodCutting(ar));

	}
	//0,1,2,3,4,5,6,7,8,
	public static int rodCutting(int arr[]) {

		//storage
		int strg[] = new int[arr.length];

		strg[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			strg[i]=arr[i];
			for (int cutsize = 1; cutsize <= i/2; cutsize++) {
				strg[i]=Math.max(strg[i], strg[i-cutsize]+strg[cutsize]);
			}

		}
		
		return strg[arr.length-1];
	}
}
