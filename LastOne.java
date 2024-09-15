package Arrays;

import org.jetbrains.annotations.NotNull;

public class LastOne {
    public int lastIndex(int arr[]){
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,1};




    }
}
