
import java.util.Scanner;

public class vowelreverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        char[] c= name.toCharArray();
        String vowels ="aeiouAEIOU";
        int left = 0;
        int right = name.length()-1;
        while(left<right)
        {
           if((vowels.indexOf(c[left]))==-1)
           {
            left++;
           }
           if((vowels.indexOf(c[right])) == -1)
           {
            right--;
           }
           else if((vowels.indexOf(c[left])) != -1 && (vowels.indexOf(c[right])) != -1)
           {
            char a= c[left];
            c[left] = c[right];
            c[right] = a;
            left++;
            right--;
           }
        }
   System.err.println(c);
   String finals = new String(c);
   System.out.println(finals);
        
    }
}