
import java.util.Scanner;

public class excel1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n>=1)
        {
            n= n-1;
            int r= n%26;
            sb.append((char)('A'+r));
            n=n/26;

        }
        System.out.println(sb.reverse());
    }
}