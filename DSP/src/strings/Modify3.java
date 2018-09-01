package strings;

public class Modify3 {

	public static void main(String[] args) {
		String s= modify3("aaabbbaaaccdddeffghhh");
		System.out.println(s);

	}

	public static String modify3(String str)
	{
		StringBuilder sb= new StringBuilder();
		
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)!=sb.charAt(sb.length()-1))
			sb.append(str.charAt(i));
			
		}
		return sb.toString();
	}
}
