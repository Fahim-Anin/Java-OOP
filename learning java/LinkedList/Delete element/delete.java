public class delete {

    /**
     * Deletes a node at a given position in a linked list.
     * @param head The head of the linked list.
     * @param position The zero-based index of the node to delete.
     * @return The head of the modified linked list.
     */
    public ListNode deleteNode(ListNode head, int position) {
        // Case 1: The list is empty.
        if (head == null) {
            return null;
        }

        // Case 2: The node to be deleted is the head node (position 0).
        if (position == 0) {
            return head.next; // The new head is the next node.
        }

        // Case 3: Deleting a node in the middle or at the end.
        // We need to find the node *before* the one we want to delete.
        ListNode previous = head;
        int currentPosition = 1;

        // Traverse until we find the node at `position - 1`.
        while (currentPosition < position-1 && previous.next != null) {
            previous = previous.next;
            currentPosition++;
        }

        // If the position is out of bounds (greater than the list size),
        // we do nothing and return the original head.
        if (previous.next == null) {
            return head;
        }

        // Bypass the node at the target position.
        // `previous.next` is the node to be deleted.
        // `previous.next.next` is the node after it.
        previous.next = previous.next.next;

        return head;
    }

    /* --- Helper Code for Testing --- */
    // ListNode definition
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) 
        { 
            this.val = val; 
        }
    }

    // Method to print the list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        delete solution = new delete();
        
        // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        solution.printList(head); // 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Delete node at position 2 (the node with value 3)
        head = solution.deleteNode(head, 2);
        
        System.out.println("\nList after deleting node at position 2:");
        solution.printList(head); // 1 -> 2 -> 4 -> 5 -> null
    }
}