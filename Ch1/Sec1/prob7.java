public class prob7
{
	public static int div(int a, int b)//return a/b, without using '*' or '%'
	{
		int q = 0;
		int r = a;
		while(r>=b)//loop invariant: a = q*b + r
		{
			r-=b;
			q++;
		}
		return q;
	}
	public static int fastDiv(int a, int b)//return a/b without using '*' or '%' in O(lg (a/b)) time
	{
		int bPow2 = b;
		while(bPow2<=a)
		{
			bPow2*=2;
		}
		int q = 0;
		int r = a;
		while(bPow2!=b)//loop invariant: a = bPow2*q + r, with r<bPow2
		{
			bPow2/=2;//a = 2*bPow2*q + r
			q*=2;//a = bPow2*q + r
			if(r>=bPow2)//in this case, due to the invariant, bPow2<=r<2*bPow2. If r<bPow2 the invariant is already satisfied
			{
				q++;//now a = bPow2*(q-1) + r => a = bPow2*q + (r - bPow2)
				r-=bPow2;//a = bPow2*q + r, with (0<=r<bPow2), satisfying the loop invariant
			}
		}
		return q;
	}
	public static void main(String[]args)
	{
		System.out.println(div(1000000000,1));
//		System.out.println(fastDiv(1000000000,1));
	}
}
