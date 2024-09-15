package Arrays;

public class LimitedRangeFreq {
    public static void limitedFreq(int[] arr, int a, int b){
        for (int i = a; i <= b; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    frequency++;
                }
            }
            System.out.println("element " +i+ " has a frequency of " +frequency);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,3,5,4,3,3,9,8};
        int a = 2;
        int b = 4;
        limitedFreq(arr, a, b);
    }
}
