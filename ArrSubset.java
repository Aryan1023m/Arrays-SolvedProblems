package Arrays;

public class ArrSubset {
    public static boolean arraySubsetOfAno(int[] arr1, int[] arr2, int n, int m){
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(arr2[i] == arr1[j]){
                    break;
                    }
                }
            if(j == m){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7,8};
        int[] arr2 = {5,6,7};
        int m = arr1.length;
        int n = arr2.length;
        if(arraySubsetOfAno(arr1,arr2,m,n)){
            System.out.println("yes");
        }
            else{
            System.out.println("no");
        }
    }
}
