package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderArray {

        public static List<Integer> findLeaders(int[] arr) {
            List<Integer> leaders = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                boolean isLeader = true;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        isLeader = false;
                        break;
                    }
                }
                if (isLeader) {
                    leaders.add(arr[i]);
                }
            }

            return leaders;
        }

        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            List<Integer> leaders = findLeaders(arr);

            System.out.println("Leaders in the array:");
            for (int leader : leaders) {
                System.out.print(leader + " ");
            }
        }
    }

