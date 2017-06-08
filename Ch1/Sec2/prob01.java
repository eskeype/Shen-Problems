public class prob01
{
	public static void zero(int[] arr)
	{
		int i = 0;
		while(i!=arr.length)//loop invariant: arr[k] = 0 for all non-negative k<i  
		{
			arr[i] = 0;//the invariant now also holds for i+1
			i++;
		}
	}
}
