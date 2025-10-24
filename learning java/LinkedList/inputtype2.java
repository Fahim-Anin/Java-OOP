
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next= null;
    }
}



public class inputtype2{

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
            current= head.next;
        
        }
        return head.next;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ListNode lst1 = buildlist(scanner);
        ListNode lst2= buildlist(scanner);

        ListNode dummy = new ListNode(-1);
        ListNode t1 =lst1;
        ListNode t2= lst2;
       
       ListNode temp = dummy;
       while(t1 != null && t2!= null)
       {
        if(t1.val>=t2.val)
        {
            temp.next = t2;
            t2= t2.next;
        }
        else if(t1.val<t2.val)
        {
            temp.next = t1;
            t1= t1.next;
        }
        temp = temp.next;
       }

       if(t1 != null)
       {
        temp.next=t1;
       }
       else{
        temp.next = t2;
       }

      ListNode current = dummy.next; // Start from the first actual node
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