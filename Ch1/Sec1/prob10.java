public class prob10
{
	public static int[][] matrixMul(int[][] A,int[][] B)//returns the matrix product A*B (defined as out[i][j] = sum over k (A[i][k]+B[k][j])
	{
		int[][] out = new int[A.length][B[0].length];
		for(int i = 0; i<out.length; i++)
		{
			for(int j = 0; j<out[0].length; j++)
			{
				for(int k = 0; k<A[0].length; k++)
				{
					out[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		return out;
	}
	public static int[][] identity(int dim)
	{
		int[][] out = new int[dim][dim];
		for(int i = 0; i<dim; i++)
			out[i][i] = 1;
		return out;
	}
	public static int[][] matrixPower(int[][] A, int n)//returns A^n where A is a square matrix
	{
		int[][] out = identity(A.length);
		int k = n;
		int[][] B = A;
		while(k!=0)//loop invariant: A^n = out * B^k
		{
			if((k%2)==1)
			{
				k--;
				out = matrixMul(B,out);
			}
			else
			{
				k/=2;
				B = matrixMul(B,B);
			}
		}
		return out;
	}
	public static int fastFib(int n)
	{
		int[][] fibMat = {{0,1},{1,1}};
		int[][] initialConditions = {{0},{1}};
		return matrixMul(matrixPower(fibMat,n),initialConditions)[0][0];
	}
	public static void main(String[]args)
	{
		System.out.println(fastFib(5));
		System.out.println(fastFib(25));
	}
	
	
}
