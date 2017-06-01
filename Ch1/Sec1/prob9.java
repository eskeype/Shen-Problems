public class prob9
{
	public static int fib(int N)
	{
		int fibI = 0;
		int fibIpOne = 1;
		int i = 0;

		while(i!=N)//loop invariant: fibI = fib(i), fibIpOne = fib(i+1)
		{
			int fibIpTwo = fibI + fibIpOne;//by the recurrence relation fibIpTwo = fib(i+2) = fib(i) + fib(i+1)
			i++;//now fibIpTwo = fib(i+1), and fibIpOne = fib(i)
			fibI = fibIpOne;
			fibIpOne = fibIpTwo;
		}
		return fibI;
	}
	public static void main(String[]args)
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println(fib(i));
		}
	}
}
