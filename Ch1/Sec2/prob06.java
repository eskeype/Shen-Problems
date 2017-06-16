public class prob06
{
	public static int uniqueCount(int[] arr)
	{
		int i = 0;
		int count = 0;
		while(i!=arr.length)
		{
			if(!containsVal(arr[i],arr,i))
				count++;
			i++;
		}
		return count;
	}
	private static boolean containsVal(int val, int[] arr, int last)
	{
		int i = 0;
		while(i != last)
		{
			if(arr[i]==val)
				return true;
			i++;
		}
		return false;
	}
}
