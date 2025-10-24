
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class twosum{
    public static void main(String[] args) {
        List<Integer>l = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] n = new int[k];
        int[] result = new int[2];
        for(int i =0;i<k;i++)
        {
            n[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> maps = new HashMap();

        for(int i =0; i< n.length;i++)
        { 
           int a = 9- n[i];
           if(maps.containsKey(a))
           { 
             result[0] = maps.get(a);
             result[1] = i;
             break;
              
           }
           else{
            maps.put(n[i],i);
           }

        }
        System.out.println(result[0]+"," + result[1]);


    }
}