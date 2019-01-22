
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample
{

	public static void main(String[] args)
	{

		
		// ('!', ' ', '"', '#', '$', '%', '&', ''', '*', '+', '-', '.', ':', '=', '@',    --15
		//'_', ',', '/', ';', '<', '>', '?', '[', '\', ']', '^', '(', ')', '`', '{', '}', '~') -17total 32
		String str1="^(?!\\s)[a-zA-Z\\d! \"#$%&'*+-.:=@_,/;<>?\\[\\\\\\]^\\(\\)`\\{\\}~ ]{1,50}(?<!\\s)$";
		
		
		Pattern pf=Pattern.compile(str1);
		
		Matcher m= pf.matcher("  gs");
		System.out.println(m.matches());
		Matcher m1=pf.matcher("vv ");
		System.out.println(m1.matches());
		Matcher m2=pf.matcher("LENGTHGREATERTHAN50dddddddssssssssssssssssssssssssssss");
		System.out.println(m2.matches());
		Matcher  m3 =pf.matcher("LENGTH EQUAL TO 50  dddddddsssssssssssssssssssssss");
		System.out.println(m3.matches());
		Matcher m4= pf.matcher("dd!\"");
		System.out.println(m4.matches());
		Matcher m5=pf.matcher("! ,#$");
		System.out.println(m5.matches());
		Matcher m6=pf.matcher("%&'*+");
		System.out.println(m6.matches());
		Matcher m7=pf.matcher("-.:=@");
		System.out.println(m7.matches());
		Matcher m8=pf.matcher("_,/;<");
		System.out.println(m8.matches());
		Matcher m9=pf.matcher("?[]^(");
		System.out.println(m9.matches());
		Matcher m10=pf.matcher(")`{}~");
		System.out.println(m10.matches());
		Matcher m11=pf.matcher("");
		System.out.println(m11.matches());
		Matcher m12=pf.matcher("12");
		System.out.println(m12.matches());
		Matcher m13=pf.matcher("/");
		System.out.println(m13.matches());
		Matcher m14=pf.matcher("\\");
		System.out.println(m14.matches());
		Matcher m15=pf.matcher("€");
		System.out.println(m15.matches());

	}

}
