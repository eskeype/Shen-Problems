import java.lang.Math;
public class prob18
{
	public static int divGCD(int a, int b)
	{
		int out = 1;
		while((a!=0)&&(b!=0))
		{
			if(((a%2)==0)&&((b%2)==0))
			{
				out*=2;
				a/=2;
				b/=2;
			}
			else if((a%2)==0)
				a/=2;
			else if((b%2)==0)
				b/=2;
			else
			{
				int newB = Math.max(a,b) - Math.min(a,b);
				a = Math.min(a,b);
				b = newB;
			}
		}
		return out*(a+b);
	}
	public static void main(String[]args)
	{
		int a =5;
		int b = 15;
		System.out.printf("gcd(%d,%d) = %d\n",a,b,divGCD(a,b));
	}
}
