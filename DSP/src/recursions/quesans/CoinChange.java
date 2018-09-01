package recursions.quesans;

public class CoinChange {

	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {2,3,5,6};
		coinChange(coins,10,0,"",0);

	}

	public static void coinChange(int coins[], int amt, int psf, String asf, int li) {

		if(psf==amt)
		{
			count++;
			System.out.println(asf);
		}
		for (int i = li; i < coins.length; i++)

		{
			if (psf + coins[i] <= amt) {
				coinChange(coins, amt, psf + coins[i], asf + coins[i],i);
			}
		}
	}
}
