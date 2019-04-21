package hackerrankQuestion.goldman;

public class Q2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch = '0';// 0==48
		int j = ch;
		// System.out.println(j);
		// String res = secureChannel(1, "open", "123");
		String res2 = secureChannel(2, "oppeeen", "123");

		System.out.println(res2);
	}

	public static String secureChannel(int operation, String message, String key)
	{
		char ch[] = key.toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(message);
		if (operation == 1)
		{
			for (int i = 0; i < ch.length; i++)
			{
				for (int j = 0; j < ch[i] - 48; j++)
				{
					sb.append(message.charAt(i));
				}
			}
			sb.append(message.substring(ch.length));
		} else if (operation == 2)
		{
			sb.append(message.charAt(0));
			int count=0;
			for (int i = 0; i < ch.length; i++)
			{
				for (int j = 0; j < ch[i] - 48; j++)
				{
					count++;
					if (sb.length() > 0 && sb.charAt(sb.length() - 1) != message.charAt(i + j))
					{
						sb.append(message.charAt(i + j));
					}

				}

			}
			if(ch.length<=message.length())
			{
				sb.append(message.substring(count));
			}
		}

		return sb.toString();
	}

}
