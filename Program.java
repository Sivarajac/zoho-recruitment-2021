public class Program
{
	public static void main(String[] args)
	{
		
		String st = "WATER";
		int len = st.length();
		int middle = len/2;
		int val = 0;
		int val1 = 0;
		for (int i = 0; i < len; i++)
		{
			for (int j = len-1; j >= 0; j--)
			{
				if(i<j)
				{
					System.out.print(" ");
				}
				else
				{
					if(middle+val <len)
					{
						char ch = st.charAt(middle+val);
						val++;
						System.out.print(ch);
					}
					else
					{
						char ch = st.charAt(val1++);
						System.out.print(ch);
					}
				}
			}
			val1 = 0;
			val = 0;
			System.out.println();
		}
	}
}