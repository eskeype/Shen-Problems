import java.util.Arrays;
public class prob11
{
	public static void swapSections(int[] arr, int secLen)
	{
		reverseSec(arr,0,secLen-1);
		reverseSec(arr,secLen,arr.length-1);

		prob10.reverse(arr);
	}
	

	public static void reverseSec(int[] arr, int start, int end)
	{
		while (start<end)
		{
			int swap = arr[start];
			arr[start] = arr[end];
			arr[end] = swap;

			start++;
			end--;
		}
	}
	public static void main(String[]args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));

		//reverseSec(arr,0,2);
		swapSections(arr, 3);

		System.out.println(Arrays.toString(arr));

	}
}
