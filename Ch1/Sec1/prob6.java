public class prob6
{
	public static int sum(int a, int b)
	{
		int c = a;
		int k = 0;
		while(k!=b)//loop invariant: c = a + k
		{
			c++;//c = a + k - 1
			k++;//c = a + k
		}
		return c;
	}
}
