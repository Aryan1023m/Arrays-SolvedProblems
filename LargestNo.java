package Arrays;

public class LargestNo {
    public static void main(String[] args) {
        int arr[] = {23,45,89,21,7};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){

                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
