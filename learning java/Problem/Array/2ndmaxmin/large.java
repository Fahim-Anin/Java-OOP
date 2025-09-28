public class large{
    public static void main(String[] args) {
         int[] arr = {64, 34, 5, 3, 2, 11, 90};
         for(int i=0;i<arr.length-1;i++)
         {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
         }
         for(int i=1;i<arr.length;i++)
         {
            System.out.println(arr[1]);
            break;
         }
    }
}