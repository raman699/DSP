package dp;

public class CoinChangeCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 2, 3, 5, 6 };
		coinChangePer(10, c);

	}

	public static void coinChangeComb(int amount, int coins[]) {

		int strg[] = new int[amount + 1];
		strg[0] = 1;
		for (int c = 0; c < coins.length; c++) {
			int coin = coins[c];
			for (int amt = 1; amt <= amount; amt++) {
				if (coin <= amt) {

					strg[amt] += strg[amt - coin];

				}
			}
		}
		System.out.println(strg[strg.length - 1]);
	}

	public static void coinChangePer(int amount, int coins[]) {

		int strg[] = new int[amount + 1];
		strg[0] = 1;

		for (int amt = 1; amt <= amount; amt++) {
			for (int c = 0; c < coins.length; c++) {
				int coin=coins[c];
				if (coin <= amt) {

					strg[amt] += strg[amt - coin];

				}

			}
		}

		System.out.println(strg[strg.length - 1]);
	}
}
