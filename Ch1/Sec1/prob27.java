public class prob27
{
	public static void write(int n)
	{
		System.out.print(n);
	}
	public static void revPrintDig(int n)
	{
		if(n==0)
			write(0);
		while(n>0)
		{
			write(n%10);
			n/=10;
		}
		System.out.println();
	}
	public static void main(String[]args)
	{
		revPrintDig(1230000);
	}
}
