package Arrays;

public class ArrRotation {
    public static void rotate(int arr[] , int n, int d){
        int p = 1;
        while(p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
                arr[n-1] = last;
                p++;
            }
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]+" ");
            }
        }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        int d = 2;
        int n = arr.length;
        rotate(arr, n, d);
    }

}
