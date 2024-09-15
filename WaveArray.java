package Arrays;

public class WaveArray {
    public static void waveArray(int[] arr, int n){
        for(int i = 0; i < n-1; i+=2) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        waveArray(arr,n);
        for (int j:arr){
            System.out.println(j);
        }
    }
}
