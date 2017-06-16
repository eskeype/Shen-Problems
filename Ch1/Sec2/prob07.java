import java.util.Arrays;
public class prob07
{
	public static int uniqueCount(int[] arr)
	{
		return prob05.uniqueElementCount(mergeSort(arr));
	}
	public static int[] merge(int[] arr1, int[] arr2)
	{
		int[] result = new int[arr1.length + arr2.length];
		int ind1 = 0;
		int ind2 = 0;
		int indRes = 0;
		while((ind1!=arr1.length)||(ind2!=arr2.length))
		{
			if((ind1==arr1.length)||((ind2!=arr2.length)&&(arr2[ind2]<arr1[ind1])))
			{
				result[indRes] = arr2[ind2];
				ind2++;
			}
			else
			{
				result[indRes] = arr1[ind1];
				ind1++;
			}
			indRes++;
		}
		return result;
	}
	public static int[] mergeSort(int[] arr)
	{
		if((arr.length==0)||(arr.length==1))
			return arr;
		int i = 0;
			
		int[] first = new int[arr.length/2];
		for(; i<(arr.length/2); i++)
		{
			first[i] = arr[i];
		}

		int[] second = new int[arr.length - (arr.length/2)];
		for(; i<arr.length; i++)
		{
			second[i - (arr.length/2)] = arr[i];
		}

		return merge(mergeSort(first), mergeSort(second));

	}
	public static void main(String[]args)
	{
		int[] arr = {3,5,7,2,5,2,1,3452,341,6,425,143,134};

		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	
}
