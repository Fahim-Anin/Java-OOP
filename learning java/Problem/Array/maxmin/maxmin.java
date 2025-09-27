public class maxmin{
    public static void main(String[] args) {
        int[] arr = {64, 34, 34, 12, 12, 11, 90};
        int n = arr.length;
        int a = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(a<arr[i])
            {
               a=arr[i];
            }
        }
        System.out.println(a);
        for(int i=1;i<arr.length;i++)
        {
            if(a>arr[i])
            {
               a=arr[i];
            }
        }
        System.out.println(a);

    }
}