/*
Write a program in java that accepts a 2D matrix and prints
the matrix with row minimum and column minimum values.
4 3 5 3
1 0 7 0
8 4 6 4
1 0 5

*/
import java.util.*;

public class matMin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter the size of the matrix ::");
		n = sc.nextInt();
		
		int mat[][] = new int[n][n];
		int minX[] = new int[n];
		int minY[] = new int[n];
		
		System.out.println("enter the matrix ::");
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
				mat[i][j] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++)
		{
			minX[i] = mat[i][0];
			minY[i] = mat[0][i];
			for(int j = 0 ; j < n ; j++)
			{
				if(minX[i] > mat[i][j])
					minX[i] = mat[i][j];
				if(minY[i] > mat[j][i])
					minY[i] = mat[j][i];
			}
		}
		System.out.println("the ans :: ");
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println(" "+minX[i]);
		}
		for(int j = 0 ; j < n ; j++)
			System.out.print(minY[j]+" ");
	}
}