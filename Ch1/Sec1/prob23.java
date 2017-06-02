public class prob23
{
	public static void primeFactors(int n)
	{
		while(n!=1)
		{
			int i = 2;
			for(; (i*i)<=n; i++)
			{
				if((n%i)==0)
				{
					System.out.println(i);
					n/=i;
					break;
				}
			}
			if((i*i)>n)
			{
				System.out.println(n);
				n = 1;
			}
		}
	}
	public static void main(String[]args)
	{
		primeFactors(25);
	}
}
