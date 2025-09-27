
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isprime=true;
        int m = input.nextInt();
        if(m<=1 )
        {
            System.out.println("not prime");
        }

        else 
        { 
            for(int i = 2;i<=Math.sqrt(m);i++)
          if(m%i==0)
            {
               isprime = false;
               break;
            }
            
        }
        if(isprime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("no prime");
        }

    }
}