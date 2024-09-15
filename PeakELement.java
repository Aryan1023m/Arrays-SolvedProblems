package Arrays;

public class PeakELement {
    public static void main(String[] args) {
        int[] arr = {34,56,76,45,33};
        int peak = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > peak){
                peak = arr[i];
            }
        }
        System.out.println(peak);
    }
}
