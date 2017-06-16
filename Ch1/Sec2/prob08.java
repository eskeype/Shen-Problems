public class prob08
{
	public static int uniqueElementCountK(int arr[], int k)// 0<arr[i]<=k for all i
	{
		boolean[] seen = new boolean[k+1];

		int i = 0;
		while(i != arr.length)
		{
			seen[arr[i]] = true;
			i++;
		}

		int result = 0;
		int j = 0;
		while(j != seen.length)
		{
			if(seen[j])
				result++;
			j++;
		}
		return result;
	}
}
