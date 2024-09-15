package Arrays;

import java.util.Arrays;

    public class DuplicateElements {

        public static void main(String[] args) {
            int[] arr = {9, 5, 6, 8, 5, 4, 2, 2, 1};
            Duplicates(arr);
        }
        public static void Duplicates(int[] arr) {

            Arrays.sort(arr);
            System.out.print("Duplicate elements are: ");
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                    while (i < arr.length - 1 && arr[i]== arr[i + 1]) {
                        i++;
                    }
                }
            }
        }
    }
