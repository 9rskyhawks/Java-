import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index (optional, press Enter to skip): ");
        int endIndex = scanner.nextInt();

        scanner.close();

        String substring;
        if (endIndex > 0) {
            substring = originalString.substring(startIndex, endIndex);
        } else {
            substring = originalString.substring(startIndex);
        }

        System.out.println("Extracted substring: " + substring);
    }
}
