public class prob14
{
	public static int gcd(int a, int b)
	{
		while(b!=0)
		{
			int newB = a%b;
			a = b;
			b = newB;
		}
		return a;
	}
	public static void main(String[]args)
	{
		System.out.printf("gcd(%d,%d) = %d\n",234,18,gcd(234,18));
	}
}
