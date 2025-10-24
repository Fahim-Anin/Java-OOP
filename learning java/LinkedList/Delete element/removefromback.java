
import java.util.Scanner;

class ListNode{
    int value;
    ListNode next;
    public ListNode(int value)
    {
        this.value = value;
        this.next = next;
    }

}
public class removefromback{
    public static ListNode buildlist(Scanner scanner)
    {   ListNode head= new ListNode(0);
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

        ListNode dummy = new ListNode(-1);
        dummy.next = a;
        ListNode fast= dummy;
        ListNode g= dummy;
        for(int i =1;i<=3;i++)
        {
            fast= fast.next;
        }
        while(fast.next!=null)
        {
            fast= fast.next;
            g= g.next;
        }
        g.next = g.next.next;
        ListNode current = dummy.next;
        while(current != null)
        { 
            System.out.print(current.value);
            current= current.next;
            if(current != null)
            {
                System.out.print("->");
            }

        }
        System.out.println();


    }
}