package binarytree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample
{

	public static void main(String[] args)
	{
		Pattern pattern1 = Pattern.compile("^(.{1,5})?$");

		Pattern pattern2 = Pattern.compile("[!-~]|([!-~][ -~]*[!-~])");

		Pattern pattern = Pattern.compile("^(.{1,5})?$ && ^([!-~]|([!-~][ -~]*[!-~]))?$");

		Matcher matcher1=pattern1.matcher(" verify");
		
		Matcher matcher2 = pattern2.matcher("verify");

	//	System.out.println("Input String matches regex1 - " + matcher1.matches());
	///	System.out.println("Input String matches regex2 - " + matcher2.matches());
		 
		Pattern pattern3=Pattern.compile("^[^\\s][[-a-zA-Z0-9-()@#$]+(\\s+[-a-zA-Z0-9-()@#$]+)][^\\s]{1,50}$");
		
	//	Matcher matcher1 = pattern3.matcher("!@#<$%^&*()a");

		//System.out.println("Input String matches regex - " + matcher1.matches());
		
		// ('!', ' ', '"', '#', '$', '%', '&', ''', '*', '+', '-', '.', ':', '=', '@',    --15
		//'_', ',', '/', ';', '<', '>', '?', '[', '\', ']', '^', '(', ')', '`', '{', '}', '~') -17total 32
		String str="^(?!\\s)[a-zA-Z\\d$#@! ]{1,5}(?<!\\s)$";
		String str1="^(?!\\s)[a-zA-Z\\d! \"#$%&'*+-.:=@_,/;<>?#@\\[\\]^\\(\\)`\\{\\}~ ]{1,5}(?<!\\s)$";
		//^(?!\\s)[a-zA-Z\\d! \"#$%&'*+-.:=@_,/;<>?#@\\[\\]^\\(\\)`\\{\\}~ ]{1,5}(?<!\\s)$
		
		Pattern pf=Pattern.compile(str1);
		
		Matcher m= pf.matcher("  gs");
		System.out.println(m.matches());
		Matcher m1=pf.matcher("vv ");
		System.out.println(m1.matches());
		Matcher m2=pf.matcher("dd d");
		System.out.println(m2.matches());
		Matcher  m3 =pf.matcher("ddddddd");
		System.out.println(m3.matches());
		Matcher m4= pf.matcher("dd!");
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
		

	}

}
