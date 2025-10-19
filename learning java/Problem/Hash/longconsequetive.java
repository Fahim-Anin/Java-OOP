
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longconsequetive{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();

        int[] nums = new int[n];
    for(int i=0;i<n;i++)
    {
        nums[i]=scanner.nextInt();
    }
    Set<Integer> sets= new HashSet();
    for(int n1:nums)
    {
        sets.add(n1);
    }
    System.out.println(sets);
    int lastmax=0;
    for(int n2:sets)
    {
        if(!sets.contains(n2-1))
        {
            int x=n2;
            int countval=1;
            while(sets.contains(x+1))
            {
                x++;
                countval++;
            }
            lastmax= Math.max(lastmax, countval);
        }
    }
    System.out.println(lastmax);
    }
}