package recursions;

public class TowerOhHanoi {

	public static void main(String[] args) {
		toh(2,"A","C","B");

	}

	public static void toh(int n,String src,String des,String helper)
	{
		
		
		if(n==0)
		{
			return;
		}
		toh(n-1,src,helper,des);
		
		System.out.println( "Move disc ["+n+"] "+"from "+src +" to "+des);
		
		toh(n-1,helper,des,src);
		
	}
}
