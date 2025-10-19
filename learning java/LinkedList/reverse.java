
import java.util.Scanner;
class ListNode{
    int value;
    ListNode next;

    public ListNode(int value)
    {
        this.value = value;

    }
}

public class reverse{

   public static ListNode buildlist(Scanner scanner)
   {
    ListNode head= new ListNode(0);
    ListNode current = head;

    while(scanner.hasNextInt())
    {
        int input = scanner.nextInt();
        if(input ==-1)
        {
            break;
        }
        current.next  = new ListNode(input);
        current= current.next;
    }
    return head.next;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode l = buildlist(scanner);

        ListNode current = l;
        ListNode prev= null;
        ListNode n = null;

        while(current != null)
        {
            n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        
        while(prev!= null)
        {   
           
            System.out.print(prev.value + " ->");
             prev = prev.next;
            
        }
        System.out.println("null");
    }
    
}