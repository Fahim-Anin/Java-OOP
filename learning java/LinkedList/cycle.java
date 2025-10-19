
import java.util.HashSet;
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
public class cycle{
public static void printListSafely(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode current = head;

        System.out.print("List Content: ");
        while (current != null) {
            if (!visitedNodes.add(current)) {
                System.out.println("...cycle detected back to node with value " + current.value);
                break;
            }
            System.out.print(current.value + " -> ");
            current = current.next;
        }
       
    }
    public static ListNode createcycle(ListNode a, int pos){
         ListNode tail = a;
         ListNode target = a;

        for(int i =0;i<pos;i++){
            target = target.next;
         }
         while(tail.next!=null)
         {
            tail= tail.next;
         }
        
         tail.next = target;
         
         return a;


    }
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
        ListNode l = buildlist(scanner);
        ListNode k = createcycle(l,1);
        ListNode hair =k; 
        ListNode tortoise =k;
        printListSafely(k);
        // while(k!=null)
        // {
        // System.out.println(k.value+ " ->");
        //  k=k.next;
        // }
        Boolean cycle = false;

        while(tortoise!=null  && hair != null && hair.next != null)
        {
            tortoise = tortoise.next;
            hair = hair.next.next;
            if(tortoise == hair)
            {
                cycle = true;
                break;
                
            }
            
        } 
      if(cycle)
      {
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
           
    }
} 