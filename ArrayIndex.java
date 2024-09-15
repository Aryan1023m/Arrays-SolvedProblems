package Arrays;

import java.util.Scanner;

public class ArrayIndex {

    public static int index(int[] arr, int target) {
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,12,13};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = index(arr, target);
        if(index != -1){
            System.out.println("element found");
        }
        else {
            System.out.println("not found");
        }
    }
}
