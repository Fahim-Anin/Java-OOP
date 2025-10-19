import java.util.*;

public class happynumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        // The key is the number, the value is a list of its indices.
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            // A modern and concise way to do this:
            // If the key isn't present, create a new ArrayList for it.
            // Then, add the current index to the list.
            map.computeIfAbsent(currentNum, k -> new ArrayList<>()).add(i);
            
            /* // The classic if/else way to do the same thing:
            if (!map.containsKey(currentNum)) {
                // If we haven't seen this number before, create a new list
                map.put(currentNum, new ArrayList<>());
            }
            // Add the current index to the list for this number
            map.get(currentNum).add(i);
            */
        }

        System.out.println(map);
    }
}