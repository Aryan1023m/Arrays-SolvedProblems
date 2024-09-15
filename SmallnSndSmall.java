package Arrays;

public class SmallnSndSmall {
    public static void main(String[] args) {
        int arr[] = {12,45,32,46,89};
        int n = arr.length;
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }
        }
        System.out.println("The First Smallest value of the Array is " + Smallest);

        int Sec_Smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < Sec_Smallest && arr[i] > Smallest){
                Sec_Smallest = arr[i];
            }
        }
        System.out.println("The Second Smallest value of Array is " + Sec_Smallest);



    }
}
