
import java.util.Scanner;

public class validpalindrome2{
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
  
    int left =0;
    int right = name.length()-1;
    Boolean ispalindrome = true;
    while(left<right)
    {  
        char l = name.charAt(left);
        char r = name.charAt(right);
        if(!(Character.isLetterOrDigit(l)) )
        {
            left++;
            continue;
        }
        if(!(Character.isLetterOrDigit(r)))
        {
            right--;
            continue;
        }

    
        char x = Character.toLowerCase(l);
        char y = Character.toLowerCase(r);
        if(x!=y)
        {
            ispalindrome = false;
            break;
        }
        else{
            left++;
            right --;
        }
           
           

        }
         
        if(ispalindrome)
        {
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
    }
        

    
}