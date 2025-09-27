
import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
        int k =m;
        int rev=0;
        while(m>0)
        {
            int a = m/10;
            int r =m%10;
            rev= rev*10+r;
            m=a;   
    }
    if(rev==k)
    {
        System.out.print("Pl");
    }
}
}