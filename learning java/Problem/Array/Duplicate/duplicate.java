public class duplicate{
    public static void main(String[] args) {
        int[] arr = {64, 34, 34, 12, 12, 11, 90};
        int n = arr.length;
        int count =0;
        for(int i =0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    for(int i =0;i<n-1;i++)
    {
        if(arr[i]==arr[i+1])
        {   count++;
            System.out.print("Duplicate Elements: " + " "+arr[i] + " " + count );
        }
       
    }


    }
}