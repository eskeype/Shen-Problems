public class prob03
{
	public static void copy(int[] cpy, int[] paste)//copy the contents of 'cpy' into 'paste' (assuming cpy.length<=paste.length)
	{
		int i = 0;
		while(i!=cpy.length)//loop invariant for all non-negative k<i cpy[i] == paste[i], and cpy[i] remains unchanged
		{
			paste[i] = cpy[i];//now loop invariant holds for i+1
			i++;
		}
	}
}
