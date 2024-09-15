package Arrays;

public class BinaryArrSort {
    public static void binaryArrSort(int[] arr, int n){
        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] < 1){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0,1,1,1,0,0};
        int n = arr.length;
        binaryArrSort(arr,n);
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
}
