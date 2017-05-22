import java.util.Arrays;
public class prob2{
	public static void swap(int[] pair){
		int a = pair[0];
		int b = pair[1];

		//let A and B refer to the original values of a and b respectively
		a = a + b;// a = A+B
		b = a - b;//b = (A+B)-B = A
		a = a - b;//a = (A+B) - A = B
		//now a contains the value B and b contains the value A

		pair[0] = a;
		pair[1] = b;
	}
	public static void main(String[]args)
	{
		int[] input = {1,2};
		swap(input);
		System.out.println(Arrays.toString(input));
	}
}
