public class prob3
{
	public static int power(int a, int n)//computes a^n
	{
		int out = 1;
		int i = 0;
		while(i!=n)//loop invariant: out = a^i
		{
			out*=a;//out = a^(i+1)
			i++;//now out = a^i
		}
		return out;
	}
}
