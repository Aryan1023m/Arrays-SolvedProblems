package Arrays;

public class ExtraElement {
    public static int  extraElement(int[] arr1, int[] arr2, int n){
        for(int i = 0; i < n; i++){
            if(arr1[i] != arr2[i])
                return i;
        }
        return n;
    }
    public static void main(String[] args){
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {2,3,4,5};
        int n = arr2.length;
        System.out.println(extraElement(arr1,arr2,n));

    }
}
