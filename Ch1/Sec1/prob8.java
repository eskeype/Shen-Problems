public class prob8
{
	public static int factorial(int n)
	{
		int i = 0;
		int ifac = 1;
		while(i!=n)//loop invariant: ifac = i!
		{
			i++;//now ifac = (i-1)!
			ifac*=i;//ifac = i*(i-1)! = i!
		}
		return ifac;
	}
}
