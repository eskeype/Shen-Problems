public class prob9
{
	public static int fib(int N)
	{
		int fibI = 0;
		int fibIpOne = 1;
		int i = 0;

		while(i!=N)
		{
			int fibIpTwo = fibI + fibIpOne;
			i++;
			fibI = fibIpOne;
			fibIpOne = fibIpTwo;
		}
		return fibI;
	}
}
