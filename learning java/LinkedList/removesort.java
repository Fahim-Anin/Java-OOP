import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next= null;
    }
}

public class removesort{
       public static ListNode buildlist(Scanner scanner)
    {
        ListNode head= new ListNode(0); // Temporary head
        ListNode current = head;
        while(scanner.hasNextInt())
            {int input = scanner.nextInt();
            if(input == -1) {
                break;
            }
            current.next = new ListNode(input);
            current= current.next;
        
        }
        return head.next;
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ListNode l = buildlist(scanner);
        ListNode temp = l;
        

        while(temp != null && temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else
            temp= temp.next;
        }
        ListNode current = l; // Start from the first actual node
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}