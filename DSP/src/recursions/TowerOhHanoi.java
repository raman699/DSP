package recursions;

public class TowerOhHanoi {

	public static void main(String[] args) {
		toh(3,"A","B","C");

	}

	public static void toh(int n,String src,String des,String helper)
	{
		
		
		if(n==0)
		{
			return;
		}
		toh(n-1,src,helper,des);
		
		System.out.println( "from "+src +" to "+des);
		
		toh(n-1,helper,des,src);
		
	}
}
