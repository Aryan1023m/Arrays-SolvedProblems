package Arrays;

public class ShiftZeroToEnd {
    public static void shift(int[] arr, int n){

        int count =0;
        for(int i = 0; i < n; i++){
          if(arr[i] != 0){
              arr[count++] = arr[i];

              }
          }
        while (count < n){
            arr[count++ ] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,0,7,0,6,0,5,0};
        int n = arr.length;
        shift(arr,n);
        for (int j : arr) {
            System.out.println(j+ " ");
        }
    }
}
