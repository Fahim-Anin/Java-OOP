
import java.util.Scanner;

public class Series{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=1;
        int m ;
        m= input.nextInt();
        
    for(int i =1 ; i<=m; i++)
    {   System.out.println(i);
        sum= sum*i;
       
        System.out.println(sum);
    }
    System.out.println("+++++++++++++++++");
    System.out.println(sum);
    }
}