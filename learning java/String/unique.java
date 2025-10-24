
import java.util.Scanner;

public class unique{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();

        int[] n= new int[26];
        for(int i =0; i<s.length(); i++)
        {
            n[s.charAt(i) -'a']++;
        }
        int x=0;
        Boolean flag = false;
        for(int i =0; i<s.length(); i++)
        {
            if((n[s.charAt(i) -'a'])==1)
            {
                x=i;
                flag=true;
                break;
            }
            
        }
        if(flag)
        {
           System.out.println(x);
        }
        else{
            System.out.println("-1");
        }

        
    }
}