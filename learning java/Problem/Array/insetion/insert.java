import java.util.Arrays;
public class insert{
    public static void main(String[] args) {
         int[] arr = {64, 34, 34, 12, 12, 11, 90};
         //int [] arr1= new int[15];
        //int n = arr.length;
        int insertpos=2;
        int insertelement=5;
        int currentpos=0;
// //one way
//         for(int i =0; i<n;i++)
//         {   
//              arr1[currentpos]=arr[i];
//              currentpos++;

             
//         }
//         System.err.println(currentpos);
//         for(int i =currentpos;i>2;i--)
//         {
//             arr1[i+1]= arr1[i];
//         }
//     arr1[insertpos]=insertelement;
//         for(int i =0;i<arr1.length;i++)
//         System.out.print(" "+arr1[i]);

//better approach
  int[] arr1= new int[arr.length];
  for(int i =0;i<arr1.length;i++)
  {
    if(i<insertpos)
{
 arr1[i]=arr[i];
}
    
       
      else if(i==insertpos)
  {
    arr1[i]=insertelement;
  }
  else{
        arr1[i]=arr[i-1];
  }

    }
    System.out.println(Arrays.toString(arr1));
}
   
    }

    
