package recursions;

public class TowerOhHanoi {

	static int count;

	public static void main(String[] args) {
		toh(3, "A", "B", "C");
		System.out.println(count);
	}

	public static void toh(int n, String src, String des, String helper) {

		if (n == 0) {
			return;
		}
		toh(n - 1, src, helper, des);
		count++;
		System.out.println("Move disc [" + n + "] " + "from " + src + " to " + des);

		toh(n - 1, helper, des, src);

	}
}
