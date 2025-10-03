
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String>{
    public int compare(String s1, String s2)
       {
        return s1.length()-s2.length();
       }
}
public class comp1{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana",  "date","apple");
        Collections.sort(words,new StringLength());
        System.out.println(words);

        //with lambda expression
        System.out.println("With lambda expression");
        words.sort((a,b)-> a.length() - b.length());
        System.out.println(words);
    }
}