public class prob15
{
	public static int[] extendedGCD(int a, int b)
	{
		int[] aComb = {1,0};
		int[] bComb = {0,1};
		while((a*b)!=0)
		{
			if(a>=b)
			{
				aComb[0]-=bComb[0];
				aComb[1]-=bComb[1];
				a = a - b;
			}
			else
			{
				bComb[0]-=aComb[0];
				bComb[1]-=aComb[1];
				b = b - a;
			}
		}
		if(a==0)
			return bComb;
		return aComb;
	}
	public static void main(String[]args)
	{
		int[] exGCD = extendedGCD(7,15);
		System.out.printf("%d, %d\n",exGCD[0],exGCD[1]);
	}
}
