import java.util.Scanner;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value)
    {
        this.value = value;
        
    }
    
}

public class removesort2{
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
        ListNode dummy = new ListNode(-1);
        dummy.next =lst;
        ListNode prev = dummy;
        ListNode temp = lst;
        while(temp!=null && temp.next != null)
        {
          if(temp!=null && temp.value == temp.next.value)
          {
            while(temp!=null && temp.value == temp.next.value)
            {
                temp= temp.next;
            }
             prev.next = temp.next;
          }
          else{
           
            prev= prev.next;
           
          }
            temp = temp.next;
        }
        ListNode current = dummy.next;
        while(current != null)
        {
            System.out.print(current.value);
            current =current.next;
            if(current != null)
            {
                System.out.print("->");
            }
        } 
        System.out.println();




    }
}