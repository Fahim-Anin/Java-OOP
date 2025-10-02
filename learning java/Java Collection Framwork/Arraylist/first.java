import java.util.ArrayList;
import java.util.Collection;

public class first{
    public static void main(String[] args) {
        //ArrayList<Integer> numbers = new ArrayList<>();
    Collection numbers = new ArrayList();
// It looks like we are adding a primitive 'int'as Autoboxing
numbers.add(10); 
numbers.add(20);


// It looks like we are getting a primitive 'int' back as Unboxing
//int myNumber = numbers.get(0); 
//using for each
for(int x:numbers)
System.out.println(x); // Output: 10
    }
}