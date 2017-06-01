public class prob12
{
	public static double fastEApprox(int n)
	{
		int i = 0;
		int ifac = 1;
		double out = 0;
		for(;i<=n;i++)
		{
			out +=(1.0/ifac);
			ifac = ifac*(i+1);
		}
		return out;
	}
	public static void main(String[]args)
	{
		System.out.println(fastEApprox(5));
	}
}
