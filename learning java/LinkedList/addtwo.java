
import java.util.Scanner;
class ListNode{
    int value;
    ListNode next;
    public ListNode(int value)
    {

        this.value = value;
        this.next = null;
    }
}
public class addtwo{
    public static ListNode buildlist(Scanner scanner)
    { 
        ListNode head= new ListNode(0);
        ListNode current = head;
        while(scanner.hasNextInt())
        {
            int input=  scanner.nextInt();
            if(input == -1)
            {
                break;
            }
            current.next = new ListNode(input);
            current = current.next;

        }
        return head.next;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode a = buildlist(scanner);

        ListNode b = buildlist(scanner);
        ListNode result  = new ListNode(0);
        ListNode ptr = result;
        int carry=0;
        while(a != null || b !=null)
        {
            int sum = 0+carry;
            if(a != null)
            { 
                sum += a.value;
                a= a.next;

            }
            if(b != null)
            {
                sum+=b.value;
                b=b.next;
            }
            carry = sum/10;
            sum = sum%10;
        ptr.next = new ListNode(sum);
        ptr = ptr.next;

        }
         if(carry==1)
        ptr.next = new ListNode(1);
           ListNode current = result.next;
        while (current != null) {
            System.out.print(current.value); // Print the current node's value
            current = current.next; // Move to the next node
            if (current != null) {
                System.out.print(" -> "); // Add "->" if there is a next node
            }
        }
        System.out.println(); 


    }
}