package Arrays;

public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x){
        while (l <= r){

            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bn = new BinarySearch();
        int arr[] = {9,8,7,4,3};
        int n = arr.length;
        int x = 7;
        int result = bn.binarySearch(arr, 0, n-1, x);
        if (result == -1){
            System.out.println("no");
        }
        else {
            System.out.println("yes" + result);
        }
    }

}