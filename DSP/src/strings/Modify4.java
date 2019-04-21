package strings;

public class Modify4 {

	public static void main(String[] args) {
		String s = modify4("aaabbbaaaccdddeffghhd");
		System.out.println(s);

	}

	public static String modify4(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char ch = str.charAt(i);
			int j = i + 1;

			while (j < str.length() && str.charAt(j) == ch) {
				count++;
				j++;
			}
			sb.append(str.charAt(i));
			if (count > 1)
				sb.append(count);
			i = i + count - 1;

		}

		return sb.toString();
	}

	public static String modify5(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		//sb.append(str.charAt(0));
		for (int i = 0; i < str.length()-1; i++) {

			if (str.charAt(i) == str.charAt(i+1))
				count++;
			else {
				sb.append(str.charAt(i));
				if (count > 1)
				{
					sb.append(count);
				}
				count = 1;
			}
		}
		sb.append(str.charAt(str.length()-1));
		if (count > 1)
		{
			sb.append(count);
		}
		return sb.toString();

	}

}
