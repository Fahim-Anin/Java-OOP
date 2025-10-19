import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroupAnagrams {

  public static void main(String[] args) {
    GetAnagramkey k = new GetAnagramkey();
      
    String[] strs = {"act","pots","tops","cat","stop","hat"};
     
    // Check for empty inputs
    if (strs == null || strs.length == 0)
     { }

    Map<String, List<String>> frequencyStringsMap = new HashMap<>();
    for (String str : strs) {

      String frequencyString = k.getAnagramKeyval(str); 
      // If the frequency string is present, add the string to the list
      if (frequencyStringsMap.containsKey(frequencyString)) {
        frequencyStringsMap.get(frequencyString).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        frequencyStringsMap.put(frequencyString, strList);
      }
    }

    System.out.println(new ArrayList<>(frequencyStringsMap.values()));
  
  }

}
