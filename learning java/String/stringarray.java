import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class stringarray{
    public static String frequency(String stringArray)
    {  int[] count = new int[26];
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<stringArray.length();i++)
       {
         count[stringArray.charAt(i)-'a']++;

       }
       for (int i = 0; i < count.length; i++) {
    
    // Check if the count for this letter is greater than 0
    // If count[i] is 0, it means the letter never appeared, so we skip it.
    if (count[i] > 0) {
        
        // 1. Find the character.
        // We use ('a' + i) to turn the index back into a letter.
        // Example: if i = 0, ('a' + 0) -> 'a'
        // Example: if i = 1, ('a' + 1) -> 'b'
        char letter = (char) ('a' + i);

        // 2. Append the letter to the string builder
        sb.append(letter);

        // 3. Append the count for that letter
        // Example: if i = 0, count[0] is 2
        // Example: if i = 1, count[1] is 1
        sb.append(count[i]);
    }
}  

   return sb.toString();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       String[] str = new String[0];
       if(scanner.hasNextLine())
       {
        String line = scanner.nextLine();
       str = line.split(" "); 
        
       }
       

       Map<String, List<String>>maps = new HashMap<>();

    //    StringBuilder sbc = new StringBuilder();
       
       for(String s: str)
       {
        String  a  = frequency(s);
       
      // sbc.append(a).append(" ");
    //    String resultString = sbc.toString().trim();
    //    String[] st = resultString.split(" ");
    //    for(int i =0;i<st.length;i++)
    //    {
        if(maps.containsKey(a)){
            maps.get(a).add(s);

        }
        else{
            List<String>l = new ArrayList<String>();
            l.add(s);
            maps.put(a,l);
        }

       }
    
       
       
      System.out.println(new ArrayList<>(maps.values()));

       scanner.close();
    }
    
}