import java.util.Scanner;

public class matrix
{

	public static void main (String[]args)
	{

		Scanner sc = new Scanner (System.in);

		  System.out.println ("-:Sum of Two 3x3 Matrices:-");

		int[][] matrix1 = new int[3][3];

		int[][] matrix2 = new int[3][3];

		  System.out.println ("Enter elements for 1st matrix:- ");

		for (int i = 0; i < 3; i++)
			{

				for (int j = 0; j < 3; j++)
					{

						matrix1[i][j] = sc.nextInt ();

					}
			}
		System.out.println ("Enter elements for 2nd matrix:- ");

		for (int i = 0; i < 3; i++)
			{

				for (int j = 0; j < 3; j++)
					{

						matrix2[i][j] = sc.nextInt ();

					}
			}
		int[][] sumMatrix = new int[3][3];

		for (int i = 0; i < 3; i++)
			{

				for (int j = 0; j < 3; j++)
					{

						sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

					}
			}
		System.out.println ("The sum of the two matrices is:");

		for (int i = 0; i < 3; i++)
			{

				for (int j = 0; j < 3; j++)
					{

						System.out.print (sumMatrix[i][j] + " ");

					}
				System.out.println ();

			}

	}
}
