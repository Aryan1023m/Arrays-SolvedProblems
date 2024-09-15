package Arrays;
public class MissingElement {

        public static void findMissing(int[] a, int[] b) {
            for (int i : a) {
                boolean found = false;
                for (int j : b) {
                    if (i == j) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 6, 3, 4, 5};
            int[] b = {2, 4, 3, 1, 0};
            findMissing(a, b);
        }
    }

