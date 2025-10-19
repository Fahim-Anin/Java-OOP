
import java.util.Scanner;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value)
    {
        this.value = value;
        
    }
    
}
public class remove{
    public static ListNode buildlist(Scanner scanner)
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
            current.next = new ListNode(input);
            current = current.next;
        }
        return head.next;

    }
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
  
    ListNode lst = buildlist(scanner);

    int target = 6;
    while(lst.value == target)
    {
        lst= lst.next;

    }
    ListNode current =lst;
    while(current!=null && current.next !=null)
    {
        if(current.next.value == target)
        {
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
    }

    while(lst!=null)
    {
        System.out.print(lst.value + "->");
        lst = lst.next;
    }
    System.out.println("null");
    
}   

}