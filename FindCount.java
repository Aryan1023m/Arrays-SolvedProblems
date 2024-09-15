package Arrays;

public class FindCount {
    public static int find_count(int[] arr, int length, int num, int diff){
        int count = 0;
        boolean found = false;

        for(int i = 0; i < length; i++){
            if(Math.abs(arr[i] - num) <= diff){
                count++;
                found = true;
            }
        }
        return found ? count : -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};
        int length = arr.length;
        int num = 13;
        int diff = 2;
        System.out.println(find_count(arr,length,num,diff));
    }
}
