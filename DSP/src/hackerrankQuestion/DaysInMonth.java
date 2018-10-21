package hackerrankQuestion;

import java.util.Scanner;

public class DaysInMonth {

	static int startDays;
	static int numberOfDays;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		for(int t1=0;t1<t;t1++)
		{
			numberOfDays = sc.nextInt();
			String s= sc.next();
			
			startDays = getStartOfDayInMonth(s);
		
		for(int i=0;i<7;i++)
		{
			if(startDays==0)
			{
				findDays(numberOfDays,startDays+i+1 ,1);
			}
			else if(numberOfDays<=30)
			findDays(numberOfDays,(startDays+i+2)%7==0?7: (startDays+i+2)%7,1);
			else if(numberOfDays>30)
				findDays(numberOfDays,(startDays+i+4)%7==0?7: (startDays+i+4)%7,1);
		}
		System.out.println();
		}
			
	}

	public static int getStartOfDayInMonth(String s)
	{
		switch (s)
		{
		case "mon": return 0;
		case "tues": return 1;
		case "wed": return 2;
		case "thurs": return 3;
		case "fri": return 4;
		case "sat": return 5;
		case "sun": return 6;
		default : return -1;
		
		}
	}
	public static void findDays(int numberOfDays, int day, int ans) {

		if(day+7>numberOfDays)
		{
			System.out.print(ans+" ");
			return ;
		}
		
		if(day<numberOfDays)
		{
			findDays(numberOfDays,day+7,ans+1);
		}
	}

}
