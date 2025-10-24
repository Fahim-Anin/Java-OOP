
import java.util.Scanner;

public class lenofthelastword{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       String name = scanner.nextLine();
       
       String s =name.trim();
       int lastindexofspace = s.lastIndexOf(' ');

       int lengthoflastwords = s.length() - lastindexofspace -1;
       System.out.println(lengthoflastwords);


    }

}