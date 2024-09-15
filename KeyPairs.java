package Arrays;

public class KeyPairs {
    public static int keyPair(int[] arr, int n, int target ){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Key Pair"  +arr[i]+","+ arr[j]);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={6,7,6,4,3};
        int target = 12;
        int n = arr.length;
        keyPair(arr, n, target);
    }
}
