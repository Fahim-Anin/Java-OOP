
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
public class comp{

  

   
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();

        nums.add(42);
        nums.add(51);
        nums.add(48);
        nums.add(39);
          Comparator<Integer>com = new Comparator<Integer>()
    {
  
    
      public int compare(Integer i, Integer j)
      {
        if(i%10> j%10)
        {
            return 1;
        }
        else{
            return -1;
        }
      }
    };  
        
        int result1 = com.compare(48, 51);
        System.out.println("Comparing 48 and 51: " + result1);  
        // it returns 1 if first number is greater than second number  then 

        Collections.sort(nums, com);
        System.out.println(nums);


      

    }
}