package Arrays;

public class MaximumZeros {
        public static int countSuccessiveZeros(int[] values) {
            int maxLength = 0;
            int tempLength = 0;

            for (int value : values) {
                if (value == 0) {
                    tempLength++;
                } else {
                    maxLength = Math.max(maxLength, tempLength);
                    tempLength = 0;
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 0, 0, 2, 4, 0, 2, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 7, 0};
            System.out.println("Maximum number of consecutive zeros: " + countSuccessiveZeros(arr));
        }
    }


