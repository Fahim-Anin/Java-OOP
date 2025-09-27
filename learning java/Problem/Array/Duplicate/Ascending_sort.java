public class Ascending_sort{
        public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        for(int i =0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("Sorted array using Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        }
}