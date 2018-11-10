package recursions.quesans;

public class Installments {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paymentP(10, new int[] { 2, 3, 5, 6 }, "", 0);
//		count=0;
//		paymentC(10, new int[] { 2, 3, 5, 6 }, "", 0,-1);
//		count=0;
//		paymentCC(10, new int[] { 2, 3, 5, 6}, "",0);
//		count=0;
		
		System.out.println(count);

	}

	public static void paymentP(int amount, int[] emiA, String asf, int amountc) {
		if (amount == amountc) {
			System.out.println(count + "." + asf);
			count++;
			return;
		} else if (amountc > amount) {
			return;
		}
		for (int i = 0; i < emiA.length; i++) {
			paymentP(amount, emiA, asf + emiA[i], amountc + emiA[i]);
		}
	}
	public static void paymentC(int amount, int[] emiA, String asf, int amountc,int emiAmountCovered) {
		if (amount == amountc) {
			System.out.println(count + "." + asf);
			count++;
			return;
		} else if (amountc > amount) {
			return;
		}
		for (int i =emiAmountCovered+1; i < emiA.length; i++) {
			paymentC(amount, emiA, asf + emiA[i], amountc + emiA[i],i);
		}
	}
	
	public static void paymentCC(int amount, int[] emiA, String asf,int emiAmountCovered) {
		if (amount == 0) {
			System.out.println(count + "." + asf);
			count++;
			return;
		} 
		for (int i =emiAmountCovered; i < emiA.length; i++) {
			if(amount>=emiA[i])
			{
				paymentCC(amount-emiA[i], emiA, asf + emiA[i], i);
			}
		}
	}
	
}
