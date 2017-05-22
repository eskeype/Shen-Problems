public class prob5
{
	public static int multiply(int a, int b)//return a*b
	{
		int out = 0;
		int i = 0;
		while(i!=b)//loop invariant: out = a * i
		{
			out+=a;//out = a * (i+1)
			i++;//out = a * i
		}
		return out;
	}
	public static int fastMul(int a, int b)//return a*b in O(lg b)
	{
		int A = a;
		int B = b;
		int out = 0;
		while(B!=0)//loop invariant: a*b = out + (a*b)
		{
			if((B%2)==1)
			{
				out+=A;//a*b = (out-A) + (A*B)
				B--;//a*b = (out - A) + (A * (B+1)) => expanding the second term and canceling the A's, we get a*b = out + A*B
			}
			else
			{
				A+=A;//a*b = out + ((A/2)*B)
				B/=2;//a*b = out + ((A/2)*(B*2)) => canceling the 2's we get a*b = out + A*B
			}
		}
		return out;
	}
}
