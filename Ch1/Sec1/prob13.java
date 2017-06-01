public class prob13
{
	public static int gcd(int a, int b)
	{
		int A = Math.max(a,b);
		int B = Math.min(a,b);
		while(B!=0)
		{
			int newA  = Math.max(A-B,B);
			B = Math.min(A-B,B);
			A = newA;
		}
		return A;
	}
	public static void main(String[]args)
	{
		System.out.printf("gcd(%d,%d) = %d\n",91,57,gcd(91,57));
	}
	
}
