
import java.util.Scanner;

public class validpalindrome{
    public static void main(String[] args)
    { 
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        
        StringBuilder lowercaseBuilder = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            // Check if the character is an uppercase letter (ASCII values A-Z are 65-90)
            if (ch >= 'A' && ch <= 'Z') {
                // Add 32 to the ASCII value to convert to lowercase
                ch = (char) (ch + 32);
            }
            lowercaseBuilder.append(ch);
        }
        String resultString = lowercaseBuilder.toString();

        for(int i =0;i<resultString.length();i++)
        {   char ch = resultString.charAt(i);
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
            }

        String a = sb.toString();
        StringBuilder sc = new StringBuilder();
       
       for(int i=a.length()-1;i>=0;i--)
       {
             sc.append(a.charAt(i));
       }
       String finals = sc.toString();

       if(a.equals(finals))
       {
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }


                                                                                                                                   
    }
}