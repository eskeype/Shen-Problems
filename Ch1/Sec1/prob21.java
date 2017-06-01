public class prob21
{
	public static void printSquares(int n)
	{
		int sqI = 0;
		for(int i  = 0; i<=n; i++)
		{
			System.out.println(sqI);
			sqI+=i+i+1;
		}
	}
	public static void main(String[]args)
	{
		printSquares(20);
	}
}
