public class array{
    public static void main(String[] args) {
        int[] arr = {64, 34, 34, 12, 12, 11, 90};
        int[] arr1= {3,2,4,6,};
        int[] arr2 =  new int[arr.length + arr1.length];
        int m=arr.length;
        int n = arr1.length;
        int currentpos=0;
        for(int i=0;i<m;i++)
        {
            arr2[currentpos]=arr[i];
            currentpos++;
        }

        for(int i=0;i<n;i++)
        {
            arr2[currentpos]=arr1[i];
            currentpos++;
        }

        for(int i=0;i<(m+n);i++)

        {
            //System.out.println(arr2[i]);
        }

        for(int i =0;i<(m+n)-1;i++)
        {
            for(int j=0;j<(m+n)-1;j++)
            {
                if(arr2[j+1]>arr2[j])
                {
                  int  temp=arr2[j+1];
                  arr2[j+1]=arr2[j];
                  arr2[j]=temp;
                }
            }


        }
        for(int i=0;i<(m+n);i++)
        System.out.println(arr2[i]);



    }
}