public class prob4
{
	public static int fastPow(int a,int b)//compute a^b in O(lg(b))
	{
		int out = 1;
		int A = a;
		int B = b;
		while(B!=0)//loop invariant: a^b = out * (A^B)
		{
			if((B%2) == 1)
			{
				out*=A;//a^b = (out/A) * (A^B)
				B--;//a^b = (out/A) * (A * (A^B)) => canceling the A's we get a^b = out * (A^B) again
			}
			else
			{
				B/=2;//a^b =out * (A^(2*B))
				A*=A;//a^b = out * ((A^2)^(2*B)) => canceling the 2's we get a^b = out * (A^B) again
			}
		}
		return out;
	}
	public static void main(String[]args)
	{
		System.out.println(fastPow(9,5));
	}
}
