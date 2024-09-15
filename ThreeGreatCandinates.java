package Arrays;
import java.util.Arrays;
public class ThreeGreatCandinates {

        public static void main(String[] args) {
            int[] arr = { 10, 3, 5, 6, 20 };
            int n = arr.length;

            Arrays.sort(arr);

            int maxCollectiveAbility = arr[n - 1] * arr[n - 2] * arr[n - 3];

            System.out.println("Maximum collective ability: " + maxCollectiveAbility);
        }
    }


