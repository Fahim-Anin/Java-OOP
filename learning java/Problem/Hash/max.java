import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class max{
    public static void main(String[] args)
    {  
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the " + n + " elements of the array (separated by spaces):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("give input k");
        int k = scanner.nextInt();

        Map<Integer, Integer>maps = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            maps.put(nums[i], maps.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer, Integer>>l = new ArrayList<>(maps.entrySet());
        l.sort((a,b)-> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i=0;i<k;i++)
        { 
            result[i] = l.get(i).getKey();

        }
        System.out.println(Arrays.toString(result));


    }
}