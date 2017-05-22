public class prob1{
	public static void swap(int[] pair){
		int a = pair[0];
		int b = pair[1];

		int swap = a;//swap contains the value of a
		a = b;//a contains the value of b
		b = swap;//b contains the value of a

		pair[0] = a;
		pair[1] = b;
	}
}
