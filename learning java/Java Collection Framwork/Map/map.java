
import java.util.HashMap;
import java.util.Map;

public class map{
 public static void main(String[] args) {
       Map<String, Integer> newmap = new HashMap<String, Integer>();
       newmap.put("Fahim", 129);
       newmap.put("Anin", 125);
       System.out.println(newmap.containsKey("ANIN"));
       newmap.put("Anin", 126); 
       System.out.println(newmap);     
    
 }
}