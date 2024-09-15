package Arrays;

public class EqualibriumPoint {
        public static int findEquilibriumIndex(int[] arr) {
            int n = arr.length;
            int[] forward = new int[n];
            int[] rev = new int[n];

            forward[0] = arr[0];
            rev[n - 1] = arr[n - 1];

            for (int i = 1; i < n; i++) {
                forward[i] = forward[i - 1] + arr[i];
            }

            for (int i = n - 2; i >= 0; i--) {
                rev[i] = rev[i + 1] + arr[i];
            }

            for (int i = 0; i < n; i++) {
                if (forward[i] == rev[i]) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {-7, 1, 5, 2, -4, 3, 0};
            int equilibriumIndex = findEquilibriumIndex(arr);
            System.out.println("Equilibrium index: " + equilibriumIndex);
        }
    }
