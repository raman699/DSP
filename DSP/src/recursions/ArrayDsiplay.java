package recursions;

public class ArrayDsiplay {

	public static void main(String[] args) {
		int[] arr = { -4, -5, -3, -3, -9, -2, -9 };
		// display(arr, 0);
		// revDisplay(arr, 0);
		// int r = max(arr, 0);
		// System.out.println(r);
//		boolean r = find(arr, 0, -11);
//		System.out.println(r);
		int r = lastIndex(arr, 0, -4);
		System.out.println(r);

	}

	public static void display(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		display(arr, vidx + 1);

	}

	public static void revDisplay(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		revDisplay(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	public static int max(int[] arr, int vidx) {

		int max = 0;
		if (vidx == arr.length) {
			return arr[arr.length - 1];
		}
		int r = max(arr, vidx + 1);
		if (r > arr[vidx]) {
			max = r;
		} else
			max = arr[vidx];
		return max;
	}

	public static boolean find(int[] arr, int vidx, int data) {

		if (vidx == arr.length) {
			return false;
		}

		boolean b = find(arr, vidx + 1, data);
		if (b || arr[vidx] == data) {
			return true;
		} else {
			return false;
		}

	}

	public static int findFirst(int[] arr, int vidx, int data) {

		if (vidx == arr.length) {
			return -1;
		}

		if (data == arr[vidx]) {
			return vidx;
		}
		int r = findFirst(arr, vidx + 1, data);
		return r;
		// int r= findFirst(arr,vidx+1,data);
	}

	public static int lastIndex(int[] arr, int vidx, int data) {

		if (vidx == arr.length) {
			return -1;
		}
		int r = lastIndex(arr, vidx + 1, data);
		if (r != -1) {
			return r;
		} else if (arr[vidx] == data) {
			return vidx;
		} else {
			return -1;
		}

	}
}