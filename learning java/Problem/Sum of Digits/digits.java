
import java.util.Scanner;

public class digits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
        int sum =0;
        while(m>0)
        {   
            int a = m/10;
            //System.out.println(a);
            
            int r=m%10;
            sum=sum+r;
            m=a;

        }
        System.out.println(sum);
        

    }
}