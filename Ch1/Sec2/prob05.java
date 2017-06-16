public class prob05
{
	public static int uniqueElementCount(int[] arr)//returns the number of unique elements in a nondecreasing int array
	{
		int i = 1;
		int count = 1;
		while(i!=arr.length)//loop invariant: count contains the # of unique elements of arr[0 ... i-1]
		{
			if(arr[i]>arr[i-1])//by nondecreasing condition arr[i]>arr[k] for all k<i. So, # of unique elements in arr[0...i] is (1 + # of unique elements in arr[0 .. i-1](count))
				count++;
			//otherwise arr[i]==arr[i-1] so arr[i] is not a unique element among the set arr[0 ... i]
			i++;
		}
		return count;
	}
	public static void main(String[]args)
	{
		int[] arr = {1,1,1,2,2,3,6,7,7,8,9,10,10,10,100};
		System.out.println(uniqueElementCount(arr));
	}
}
