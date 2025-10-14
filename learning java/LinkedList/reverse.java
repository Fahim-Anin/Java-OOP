// File: reverse.java

public class reverse {
    // The head of the list. It's the entry point to our list.
    Listnode head;

    /**
     * Reverses the linked list using the iterative three-pointer approach.
     */
    public void reverse() {
        Listnode previous = null;
        Listnode current = head;
        Listnode nextNode = null;

        while (current != null) {
            // Save the link node before we break the link
            nextNode = current.link;

            // Reverse the link for the current node
            current.link = previous;

            // Move both 'previous' and 'current' pointers one step forward
            previous = current;
            current = nextNode;
        }

        // After the loop, 'previous' is the new head. Update it.
        head = previous;
    }

    /**
     * Pushes a new node to the front of the list.
     */
    public void push(int newData) {
        Listnode newNode = new Listnode(newData);
        newNode.link = head;
        head = newNode;
    }

    /**
     * Prints the contents of the linked list from head to tail.
     */
    public void printList() {
        Listnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("NULL");
    }
}