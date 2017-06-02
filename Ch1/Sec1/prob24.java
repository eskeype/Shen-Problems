public class prob24
{
	public static boolean isPrime(int n)
	{
		int i = 2;
		while(i*i<=n)
		{
			if((n%i)==0)
				return false;
			i++;
		}
		return true;
	}
	public static void main(String[]args)
	{
		int a = 25;
		System.out.println(a+" is prime: "+isPrime(a));
	}
}
