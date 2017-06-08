public class prob04
{
	public static int max(int[] arr)//returns largest integer in arr
	{
		int mx = arr[0];
		int i = 1;
		while(i!=arr.length)//loop invariant: mx contains the maximum element of arr whose index is less than i
		{
			if(arr[i]>mx)//if arr[i]>mx, arr[i]>=arr[k] for all k<(i+1) by the loop invariant. Else, mx remains the max for all k<(i+1)
				mx = arr[i];
			i++;
		}
		return mx;
	}
}
