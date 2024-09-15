package Arrays;
import java.util.Scanner;

public class DeleteKthElement {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the index of the element to delete (0 to " + (arr.length - 1) + "): ");
            int k = scanner.nextInt();


            if (k < 0 || k >= arr.length) {
                System.out.println("Invalid index.");
            } else {
                deleteKthElement(arr, k);
                System.out.print("Array after deletion: ");
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        public static void deleteKthElement(int[] arr, int k) {
            for (int i = k; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

