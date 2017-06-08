public class prob30
{
	public static void oneOverN(int n,int k)
	{
		//(10^k) = q*n + r
		//(10^(k+1)) = 10*(q*n + r) = (10*q)*n + 10*r = 10*
		int r = 1;
		int i = 0;
		System.out.print("0.");
		while(i!=k)//loop invariant: n>r>=0, the first i digits have been printed
		{
			r*=10;

			int dig = 9;
			while((dig*n)>r){dig--;}

			System.out.print(dig);
			r -= dig*n;
			i++;
		}
		System.out.println();
	}
	public static void main(String[]args)
	{
		oneOverN(2,3);
		oneOverN(3,30);
		oneOverN(7,50);
	}
}
