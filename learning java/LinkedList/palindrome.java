
import java.util.Scanner;
class ListNode{
    int value;
    ListNode next;

    public ListNode(int value)
    {
        this.value = value;
        
    }
}
public class palindrome{
    public static ListNode buildlst(Scanner scanner)
    {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while(scanner.hasNextInt())
        {
            int input = scanner.nextInt();
            if(input == -1)
            {
                break;
            }
            current.next=  new ListNode(input);
            current = current.next;
        }
        return head.next;
    }
    public static ListNode m(ListNode l)
    {
        ListNode hair = l;
        ListNode tortoise = l;

        while(hair != null && hair.next!= null )
        {
            tortoise = tortoise.next;
            hair= hair.next.next;

        }  
        return tortoise;
    }
    public static ListNode reverse(ListNode b)
    {
        ListNode current = b;
        ListNode prev = null;
        ListNode n = null;
    
        while(current !=null)
        {
            n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        return prev;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListNode l =buildlst(scanner);
    ListNode firsthalf = l;
    ListNode secondhalf = m(l);
    
    // 3. Reverse the second half
    ListNode secondHalfReversed = reverse(secondhalf);
    Boolean palindrome = true;
    ListNode p1 = firsthalf;
    ListNode p2 = secondHalfReversed ;
    while(p2 != null)
    {
       if(p2.value != p1.value)
       {
        palindrome = false;
        break;
       }
      p1=p1.next;
      p2 = p2.next;
    }
   
   System.out.println(palindrome);
       
    }
}