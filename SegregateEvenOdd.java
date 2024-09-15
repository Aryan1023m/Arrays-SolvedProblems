package Arrays;

public class SegregateEvenOdd {
        public static void main(String[] args) {
            int[] arr = {12, 34, 45, 9, 8, 90, 3};
            int arrSize = arr.length;

            segregateEvenOdd(arr, arrSize);

            System.out.print("Array after segregation: ");
            for (int i = 0; i < arrSize; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        static void segregateEvenOdd(int[] arr, int size) {
            int left = 0, right = size - 1;
            while (left < right) {
                while (arr[left] % 2 == 0 && left < right) {
                    left++;
                }
                while (arr[right] % 2 == 1 && left < right) {
                    right--;
                }
                if (left < right) {
                    // Swap arr[left] and arr[right]
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }

