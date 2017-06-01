public class prob22
{
	public static void primeFactors(int n)
	{
		while(n!=1)
		{
			for(int i=2; i<=n; i++)
			{
				if((n%i)==0)
				{
					System.out.println(i);
					n/=i;
					break;
				}
			}
		}
	}
	public static void main(String[]args)
	{
		primeFactors(8765);
	}
}
