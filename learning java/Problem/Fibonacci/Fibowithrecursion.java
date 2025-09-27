
import java.util.Scanner;

public class Fibowithrecursion{
    public int recurse(int a)
{
    if(a==0)
    {
        return 0;
    }
    if(a==1)
    {
        return 1;
    }
    else{
        return recurse(a-1)+recurse(a-2);

    }
 }


    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
        
        Fibowithrecursion b= new Fibowithrecursion();
        for(int i=0;i<m;i++)
        {int c = b.recurse(i);
        System.out.print(c);
        }

    }
}