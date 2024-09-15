package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoArraysSame {
   public static boolean  areEqual(int[] arr1, int[] arr2) {
       int n = arr1.length;
       int m = arr2.length;

       if (n != m)
           return false;

       Arrays.sort(arr1);
       Arrays.sort(arr2);

           for (int i = 0; i < n; i++)
               if (arr1[i] != arr2[i])
                   return false;
       return true;
   }
    public static void main(String[] args) {
        int arr1[] = {3,6,2,5,5,7};
        int arr2[] = {2,3,7,5,5};
        if(areEqual(arr1, arr2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
