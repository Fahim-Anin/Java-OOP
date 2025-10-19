
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binary{
    public static ListNode build(Scanner scanner)
    {   ListNode head = new ListNode(0);
        ListNode current = head;
        while(scanner.hasNextInt())
        {
            int input = scanner.nextInt();
            if(input == -1)
            {
                break;
            }
            current.next = new ListNode(input);
            current= current.next;
        }
        return head.next;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode l = build(scanner);

        List<Integer> lst = new ArrayList<>();
        while(l!=null)
        {
            lst.add(l.value);
            l=l.next;
        }
       int decimalvalue =0;
        int power =0;
        for(int i =lst.size()-1; i>=0;i--)
        {
           
          
           
           if(lst.get(i) ==1)
           {
           decimalvalue+=Math.pow(2,power);
           }
           power++;
        }
        System.out.println(decimalvalue);



    }
}