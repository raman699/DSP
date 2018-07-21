package charaxters;

import java.util.Scanner;

public class ChnageCase {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("upper");
			char ch1= (char)(ch-'A'+'a');
			System.out.println(ch1);
		}
		else if (ch>='a'&&ch<='z')
		{
	
			System.out.println("lower");
			char ch1= (char)(ch-'a'+'A');
			System.out.println(ch1);
		}
		else
		{
			System.out.println("special");
		}

	}

}
