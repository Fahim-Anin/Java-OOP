
import java.util.Scanner;

public class Recursion_practice{
    public int recursive(int b)
    {  int sum =1;
        while(b>0)
        {
            sum= b*sum;
            b=b-1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();  
        Recursion_practice x= new Recursion_practice(); //calls for object to access nonstatic
        int a = x.recursive(m);
        System.out.println(a);   
          
           }
}