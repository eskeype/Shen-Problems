public class prob26
{
	public static void write(int n)//only to be used on 10>n>=0
	{
		System.out.print(n);
	}
	public static void printDig(int n)
	{
		if(n==0)
		{
			write(n);
		}
		else
		{
			int pow10 = 1;
			while(pow10<n)
				pow10*=10;
			pow10/=10;
			while(pow10>=1)
			{
				write(n/pow10);
				n = n%pow10;
				pow10/=10;
			}
		}
		System.out.println();
	}
	public static void printDig2Helper(int n)
	{
		if(n>0)
		{
			printDig2Helper(n/10);
			write(n%10);
		}
	}
	public static void printDig2(int n)
	{
		if(n==0)
			write(0);
		else
			printDig2Helper(n);
		System.out.println();
	}
	public static void main(String[]args)
	{
		printDig2(1234500);
	}
}
