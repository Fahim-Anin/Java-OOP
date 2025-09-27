import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.print("Fibonacci Series: " + firstTerm + " " + secondTerm);
        
        // Loop starts from 2 because the first two terms are already printed.
        // It runs until it has printed 'n' terms in total.
        for (int i = 2; i < n; i++) {
            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            
            // Update the terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); // For a new line at the end
    }
}