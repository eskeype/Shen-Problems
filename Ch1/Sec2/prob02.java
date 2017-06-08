public class prob02
{
	public static int countZeros(int[] arr)
	{
		int count = 0;
		int i = 1;
		while(i!=arr.length)//loop invariant: count = # of times 0 appears in arr[0 ... i-1]
		{
			if(arr[i]==0)
				count++;
			//count now contains the # of times 0 appears in arr[0 .. i]
			i++;
		}
		return count;
	}
}
