package Arrays;
public class ProductArrPuzzle {
    public static int[] puzzle(int arr[]){
        int n = arr.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    product *= arr[j];
                }
            }
            result[i] =product;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9};
        int[] result = puzzle(arr);

        System.out.println("The product of the array is:");
        for (int res : result) {
            System.out.print(res + " ");

        }
    }
}
