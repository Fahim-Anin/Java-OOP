
import java.util.Scanner;


public class matrix{
    public static void main(String[] args) {
        int[] []arr = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               arr[i][j]= input.nextInt();
            }
        }
        int diagonalsum =0;
        int  upptrianglesum =0;
        int lowtrianglesum=0;
         for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              System.out.print(" " + arr[i][j]);
              //SUM OF DIAGONAL 
              if(i==j)
              {
                 diagonalsum=diagonalsum+arr[i][j];
                
              }
              if(i<j)
              {
                 upptrianglesum = upptrianglesum+arr[i][j];
              }
              if(i>j)
              {
                   lowtrianglesum = lowtrianglesum+arr[i][j];
              }
            }
            System.out.println();
        }
        System.out.println(diagonalsum);
        System.out.println(upptrianglesum);
        System.out.println(lowtrianglesum);
    }
}