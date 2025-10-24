
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class longpalindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        Map<Character, Integer>maps = new HashMap<>();

        for(int i=0;i<name.length();i++)
        {  
            char c= name.charAt(i);
            maps.put(c, maps.getOrDefault(c,0)+1);
        }
        int sum =0;
        //System.out.println(maps.values());
        Boolean isp = false;
        for(Integer x: maps.values())
        {   //System.out.println(x);
            if(x%2==0)

            {   
                sum=sum+x;
            }
            else{
                sum=sum+x-1;
                isp=true;
            }
        }
        
        //System.out.println(maps);
        //System.out.println(sum+1);

    }
}