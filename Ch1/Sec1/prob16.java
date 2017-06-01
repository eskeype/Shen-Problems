public class prob16
{
	public static int[] fastExtGCD(int a, int b)
	{
		int[] aComb ={1,0};
		int[] bComb ={0,1};
		while(b!=0)
		{

			aComb[0] -= (a/b)*bComb[0];
			aComb[1] -= (a/b)*bComb[1];

			int[] swap = aComb;
			aComb = bComb;
			bComb = swap;	

			int newA = b;
			b = a%b;
			a = newA;

		}
		return aComb;
	}
	public static void main(String[]args)
	{
		int a = 92;
		int b = 57;
		int[] out = fastExtGCD(a,b);
		System.out.printf("gcd is %d: %d, %d\n",out[0]*a+out[1]*b,out[0],out[1]);
	}
}
