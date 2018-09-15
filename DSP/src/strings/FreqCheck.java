package strings;

public class FreqCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbabaabbbbbbbbb";
		int ar[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ar[ch - 'a']++;
		}

		int max = ar[0];
		int index = 0;
		for (int i = 0; i < 26; i++) {
			if (ar[i] > max) {
				max = ar[i];
				index = i;
			}
		}
		char ch = (char) (index + 97);
		System.out.println(ch);

	}

}
