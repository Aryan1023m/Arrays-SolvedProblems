package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CountElement {

        public static void main(String[] args) {
            int n = 3;
            int[] a = {4, 1, 2};
            int[] b = {1, 7, 3};
            int q = 2;
            int[] query = {0, 1};

            Set<Integer> uniqueElementsB = new HashSet<>();
            for (int element : b) {
                uniqueElementsB.add(element);
            }

            for (int x : query) {
                int ax = a[x];
                int count = 0;

                for (int element : uniqueElementsB) {
                    if (element <= ax) {
                        count++;
                    }
                }

                System.out.println("For query " + x + ", there are " + count + " elements in 'b' less than or equal to " + ax);
            }
        }
    }

