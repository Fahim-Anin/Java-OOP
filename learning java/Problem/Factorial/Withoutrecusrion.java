import java.util.Scanner;
public class Withoutrecusrion{
  
  public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int m = input.nextInt();
      int sum =1;
      for(int i =1;i<=m;i++)
      {
        sum=sum*i;
      }
      System.out.println(sum);
  }
}