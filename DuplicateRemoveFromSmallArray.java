package Arrays;
import java.util.*;
public class DuplicateRemoveFromSmallArray {
        public static void removeDups(ArrayList<Integer> list) {
            Set<Integer> uniquePrimes = new HashSet<>();
            ArrayList<Integer> result = new ArrayList<>();

            for (Integer prime : list) {
                if (uniquePrimes.add(prime)) {
                    result.add(prime);
                }
            }

            list.clear();
            list.addAll(result);
        }

        public static void main(String[] args) {
            ArrayList<Integer> primes = new ArrayList<>(Arrays.asList(3, 5, 7, 2, 2, 5, 7, 7));
            removeDups(primes);
            System.out.println(primes);
        }
    }
