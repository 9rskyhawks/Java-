import java.util.Scanner;

public class SumAverage 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n)
        {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextInt();
            i++;
        }
        double average = (double) sum / n;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}