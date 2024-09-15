package Arrays;

public class BitonicPoint {
    public static int bitonicPoint(int[] arr, int n ){
        int left = 1;
        int right = arr.length - 2;

        while (left <= right){
        int mid = left + (  right - left )/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1] ){
                return arr[mid];
            }
            else if(arr[mid] < arr[mid+1]){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 11, 9, 5, 2, 1};
        int n = arr.length;
        int bitonic = bitonicPoint(arr,n);
        if(bitonic != -1){
            System.out.println("the bitonic point is: " +bitonic);
        }
        else{
            System.out.println("point not found");
        }
    }
}
