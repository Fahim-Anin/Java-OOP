
import java.util.Scanner;

public class Recursion{

public int recursive(int a){
    // {
    //     if(a>=1)
    //     {
    //         return a* recursive(a-1);
    //     }
    //     else{
    //         return 1;
    //     }
    // }
    int sum=1;
    while(a>0)
    {  
        sum= sum*a;
        a=a-1;

    }
    return sum;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        Recursion a= new Recursion();
        int b = a.recursive(m);
        System.out.println(b);
         
    }
}