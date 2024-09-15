package Arrays;

public class IntersectionTwoArray {
    public static void intersection(int[] arr1, int[] arr2, int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j] ){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 ={8,9,3,6,7};
        int m = arr1.length;
        int n = arr2.length;
        intersection(arr1,arr2,m,n);

    }
}
