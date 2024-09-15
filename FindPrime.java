package Arrays;
public class FindPrime {
        public static void main(String[] args) {
            int[] arr = {12, 17, 19, 23, 29, 33, 35, 37};
            findPrimes(arr);
        }
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void findPrimes(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(arr[i])) {
                    System.out.print(arr[i]);
                }
            }
        }
    }
