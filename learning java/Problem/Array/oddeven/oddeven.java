public class oddeven{
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 64, 34, 34, 12, 12, 11, 90};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+ " "+ "EVEN");
            }
            else{
                System.out.println(arr[i]+ " "+ "odd");
            }
        }
    }
}