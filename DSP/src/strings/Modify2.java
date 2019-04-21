package strings;

public class Modify2 {

	public static void main(String[] args) {
		String s = modify2("bdcnm");
		System.out.println(s);
		s=modify2AlternativeApproach("bdcnmd");
		System.out.println(s);

	}

	public static String modify2(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length() - 1;i++) {
			int olen = sb.length();
			char ch = sb.charAt(i);
			char ch1 = sb.charAt(i + 1);
			int diff = ch1 - ch;
			sb.insert(i + 1, diff);
			int newl = sb.length();
			int diffl = newl - olen;
			i = i + diffl;
		}
		return sb.toString();
	}
	
	public static String modify2AlternativeApproach(String str)
	{
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length()-1;i++)
		{
			int diff=str.charAt(i+1)-str.charAt(i);
			sb.append(str.charAt(i));
			sb.append(diff);
		}
		sb.append(str.charAt(str.length()-1));
		return sb.toString();
	}
}
