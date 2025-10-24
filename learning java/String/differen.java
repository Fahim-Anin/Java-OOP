
import java.util.Scanner;

public class differen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[26];
        String s= scanner.nextLine();
        String t= scanner.nextLine();
        for(int i=0;i<s.length();i++)
        {
            n[s.charAt(i)-'a']++;
            

        }
        for(int i =0 ;i<t.length();i++)
       {
          n[t.charAt(i)-'a']--;
       }

        for(int i=0;i<n.length;i++){

           if(n[i]==-1)
           {
            System.out.println((char)('a'+i));
           }
        }

    }
}