import java.util.Scanner;


public class maxmin
{

	public static void main (String[]args)
	{

		Scanner sc = new Scanner (System.in);

		  System.out.
			print ("How many elements you want to store in the array:- ");

		int n = sc.nextInt ();

		int[] arr = new int[n];

		int max = 0;


		  System.out.print ("Enter " + n + " number:- ");

		for (int i = 0; i < n; i++)

			  arr[i] = sc.nextInt ();


		for (int i = 0; i < n; i++)
			{

				if (arr[i] > max)

					max = arr[i];

			}

		int min = arr[0];

		for (int i = 0; i < n; i++)
			{

				if (arr[i] < min)
					{

						min = arr[i];

					}

			}

		System.out.println ("Maximum element present in the array:- " + max);

		System.out.println ("Minimum element present in the array:- " + min);

	}

}
