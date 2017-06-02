public class prob29
{
	public static int countInQuad(int r)//count the number of pairs (x,y) such that x^2 + y^2 < r
	{
		int x = 0;
		while((x*x)<r)
			x++;

		int y = 0;
		int count = 0;
		while((y*y)<r)
		{
			while(((y*y)+(x*x))>=r)
			{
				x--;
			}
			count+=x+1;
			y++;
		}
		return count;
	}
	public static void main(String[]args)
	{
		for(int i = 0; i<20; i++)
		{
			System.out.print(countInQuad(i*i)+", ");
		}
		System.out.println();
	}
}
