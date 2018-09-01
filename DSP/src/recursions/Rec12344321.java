package recursions;

public class Rec12344321 {

	public static void main(String[] args) {
		System.out.println(check(4));

	}

	public static String check(int n) {

		if(n==0)
		{
			return "";
		}
		
		String recRes=check(n-1);
		
		String h1=recRes.substring(0,recRes.length()/2).concat(n+"").concat(n+"").concat(recRes.substring(recRes.length()/2, recRes.length()));
		
		return h1;
		
		
	}
}
