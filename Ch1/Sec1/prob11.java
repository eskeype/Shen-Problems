//import prob8;
public class prob11
{
	public static double eApprox(int n)//return the sum 1/(0!) + 1/(1!) + ... (1/(n!))
	{
		double out = 0;
		for(int i = 0; i<=n; i++)
		{
			out = out + 1.0/prob8.factorial(i);
		}
		return out;
	}
	public static void main(String[]args)
	{
		System.out.println(eApprox(5));
	}
	
}
