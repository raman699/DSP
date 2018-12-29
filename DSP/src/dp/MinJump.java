package dp;

public class MinJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//defining the meaning is the most important part of the DP problem
		//here the storage will define the minimum way to reach the last spot/destination
		int ar[] = { 3, 2, 0, 2, 0, 3, 4, 0, 0, 2, 1 };
		System.out.println(minJump(ar));
	}

	public static Integer minJump(int arr[]) {
		//storage+ maeing
		Integer f[] = new Integer[arr.length];

		//define smaller to larger meaning
		f[arr.length - 1] = 0;

		//traverse
		for (int i = arr.length - 2; i >= 0; i--) {
			int jump = arr[i];
			if (jump == 0) {
				f[i] = null;//
			} else {
				int temp = Integer.MAX_VALUE;
				for (int j = 1; j <= jump; j++) {

					if (i + j <= arr.length - 1 && f[i + j] != null) {
						if (f[i + j] < temp) {
							temp = f[i + j];
						}
					}
				}
				f[i] = temp + 1;

			}
			System.out.println(f[i]);
		}
		//result
		return f[0];
	}
}
