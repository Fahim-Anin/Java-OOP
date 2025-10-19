import java.util.Scanner;

public class validanagram{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     String t = scanner.nextLine();
    //   String s = "anagram";
    //   String t = "anagrma";

      int[] nums = new int[26];
      for(int i =0;i<s.length();i++)
      {
        nums[s.charAt(i)-'a']++;
        nums[s.charAt(i)-'a']--;
      }
      for(int c:nums)
      {
        if(c!=0)
        {
            System.out.println("Not anagram");
        }
      }
       System.out.println(" yes anagram");

       scanner.close();
    }
    
}

