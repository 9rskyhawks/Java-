import java.util.Scanner;

public class FindMaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);


        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}