package Arrays;

public class ThirdLargestNo {
    public static void main(String[] args) {
        int[] arr= {12,35,1,10,34,1};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
