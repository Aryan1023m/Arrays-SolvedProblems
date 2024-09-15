package Arrays;

import java.util.Arrays;

public class productof_max2_min1 {
    public static int product(int[] arr1, int[] arr2, int n1) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return arr1[n1-1]*arr2[0];
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,7,8};
        int[] arr2 = {2,3,4,5,6};
        int n1 = arr1.length;

        System.out.println(product(arr1,arr2,n1));
    }
}
