package Arrays;
import java.util.Arrays;
public class SortZigZag {
        public static void sortZigZag(int arr[]) {
            Arrays.sort(arr);
            for (int i = 1; i < arr.length - 1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {4, 3, 7, 8, 6, 2, 1};
            sortZigZag(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

