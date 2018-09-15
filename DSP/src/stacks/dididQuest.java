package stacks;

public class dididQuest {

	public static void main(String[] args) {
		String s="diddiddid";
		Stack stack= new Stack(s.length()+1);
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='d')
			{
				stack.push(count);
				count++;
			}
			else
			{
				stack.push(count);
				count++;
				while(!stack.isEmpty())
				{
					int il=stack.pop();
					System.out.println(il);
				}
			}
		}
		// to handle the last "d" condition
		if(!stack.isEmpty())
		{
			while(!stack.isEmpty())
			{
				int il=stack.pop();
				System.out.println(il);
			}
		}
		// to handle the condition that we need give a number > length of the string 
		if(count<=9)
		{
			stack.push(count);
			count++;
			while(!stack.isEmpty())
			{
				int il=stack.pop();
				System.out.println(il);
			}
		}

	}

}
