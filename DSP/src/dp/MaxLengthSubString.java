package dp;

public class MaxLengthSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxLengthSubstring("abccbc"));
	}

	public static String maxLengthSubstring(String str) {
		// storage
		boolean strg[][] = new boolean[str.length()][str.length()];
		// lower triangle is already false

		// gap is the difference between two characters of the string
		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0; i < str.length() - gap; i++) {
				int j = i + gap;
				if (gap == 0) {
					strg[i][j] = true;
				} else if (gap == 1) {
					if (str.charAt(i) == str.charAt(j)) {
						strg[i][j] = true;
					}
				} else {
					if (str.charAt(i) == str.charAt(j)) {
						if (strg[i + 1][j - 1]) {
							strg[i][j] = true;
						}

					}
				}

			}
		}
		int maxLength=0;
		String s="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				//System.out.print(pc[i][j] +"  ");
				if (strg[i][j])
				{
					if(str.substring(i, j+1).length()>maxLength)
					{
						maxLength=str.substring(i, j+1).length();
						s=str.substring(i, j+1);
					}
					//System.out.println(str.substring(i, j+1));
				}
			}
		//	System.out.println();
		}
		return s;

	}
}
