package Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int N = 5;
        int totalSum = (N) * (N + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < N-1; i++) {
            arraySum += arr[i];
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number: " + missingNumber);

    }
}
