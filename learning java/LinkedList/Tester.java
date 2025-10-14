// File: Tester.java

public class Tester {
    public static void main(String[] args) {
        // 1. Create an instance of our linked list class
        reverse list = new reverse();

        // 2. Push some elements into the list
        list.push(30);
        list.push(20);
        list.push(10);

        // 3. Print the original list to see its initial state
        System.out.println("Original Linked List:");
        list.printList();

        // 4. Call the reverse method to perform the operation
        list.reverse();

        // 5. Print the list again to see the result
        System.out.println("\nReversed Linked List:");
        list.printList();
    }
}