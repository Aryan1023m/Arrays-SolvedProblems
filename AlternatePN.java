package Arrays;

import java.util.ArrayList;

public class AlternatePN {

//    public static void main(String[] args){
//        int[] arr = {1,-2,3,-4,5,-6,7,-8};
//        rearrange(arr);
//        printArr(arr);
//    }
//
//    public static void rearrange(int[] arr) {
//        int nextPositive = 0;
//        int nextNegative = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > 0){
//                swap(arr,i,nextPositive);
//                nextPositive += 2;
//            }
//            else{
//                swap(arr,i,nextNegative);
//                nextNegative += 2;
//            }
//        }
//    }
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void printArr(int[] arr){
//        for(int num : arr){
//            System.out.println(num+" ");
//        }

    public static void main(String[] arg){
        int[] arr = {1,2,-4,-5};
        int n = arr.length;
        int[] ans = rearrange(arr,n);
        for(int i = 0; i < n; i++) {
            System.out.println(ans[i]+" ");
        }
    }
    public static int[] rearrange(int[] arr, int n){

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        for(int i = 0; i < n/2; i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }
}
