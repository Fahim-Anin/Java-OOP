
import java.util.Arrays;
public class delete{
    public static void main(String[] args) {
        int[] arr = {64, 34, 5, 3, 2, 11, 90};
        int[] arr1 = new int[arr.length-1];
        int n= arr.length;
        int deletepos=2;
        for(int i =0;i<(arr.length-1);i++)
        {
            if(i<deletepos)
            {
                arr1[i]=arr[i];
            }
            else if(i==deletepos)
            {
                arr1[i]=arr[i+1];
            }
            else{
                arr1[i]=arr[i+1];
            }

        }
        System.out.println(Arrays.toString(arr1));

    }
}