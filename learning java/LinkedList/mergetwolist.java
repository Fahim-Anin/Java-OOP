import java.util.Scanner;

// Define the custom node structure used by the merge algorithm
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next= null;
    }
}

public class mergetwolist {

    // Helper to build the custom list from an array of integers
    public static ListNode buildList(Scanner scanner) {
        ListNode head= new ListNode(0); // Temporary head
        ListNode current = head;
        
        System.out.println("Enter elements (terminate with -1):");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            // Create a new custom node and link it
            current.next = new ListNode(input);
            current = current.next;
        }
        return head.next; // Return the actual head
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Take Custom Input and Build Custom Lists
        System.out.println("--- Building List 1 ---");
        ListNode list1 = buildList(scanner);
        
        System.out.println("--- Building List 2 ---");
        ListNode list2 = buildList(scanner);
        
        scanner.close(); // Close the scanner after input is done

        // 2. Your Core Merge Logic (Everything below is the merging process)
        
        // Dummy node is essential for O(1) space merging
        ListNode dummy = new ListNode(-1); 
        ListNode temp = dummy;

        ListNode t1 = list1;
        ListNode t2 = list2;

        while (t1 != null && t2 != null) {
            // Compare values and link the smaller node
            if (t1.val < t2.val) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }

        // Attach the rest of the non-empty list
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }
        
// The head of the merged list

        // 3. Print the Result
    while (dummy != null) {
        System.out.print(dummy.val+ " -> ");
        dummy = dummy.next; 
    }
    }
}