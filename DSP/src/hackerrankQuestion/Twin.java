package hackerrankQuestion;

public class Twin {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count("pepepepepepepepepepeepepeppepepep",0);
		System.out.println(count);

	}

	public static void count(String str,int vidx)
	{
		
		if(vidx==str.length()-2)
		{
			return;
		}
		if(str.charAt(vidx)==str.charAt(vidx+2))
			count++;
		count(str,vidx+1);
	}
	
}
