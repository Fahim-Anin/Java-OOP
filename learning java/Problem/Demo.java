
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0 ;
        int m;
        m=input.nextInt();
        for(int j=1;j<=m;j++)
        { if(j%2 != 10)
            {
                i=i+j;
            }


        }
        System.out.println(i);
    }
}