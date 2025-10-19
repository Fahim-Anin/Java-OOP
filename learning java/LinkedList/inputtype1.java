import java.util.LinkedList;
import java.util.Scanner;

public class inputtype1 {
    public static void main(String[] args) {
        // 1. Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // 2. Create an empty LinkedList for integers
        LinkedList<Integer> numberList = new LinkedList<>();

        System.out.println("Enter numbers to add to the list (enter any non-number to finish):");

        // 3. Loop as long as the next input is an integer
        System.out.print("Enter a number: ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // Read the integer

            // 4. Add the number to the list
            numberList.add(number);
            System.out.print("Enter another number: ");
        }

        // 5. Close the scanner
        scanner.close();

        // Display the final list
        System.out.println("\nHere is the final list of numbers:");
        System.out.println(numberList);
    }
}