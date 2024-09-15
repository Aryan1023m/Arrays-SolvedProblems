package Arrays;

public class ElementInRange {
     public static boolean elementInRange(int[] arr, int a, int b){
         if(a > b ){
             return false;
         }
         for(int i = a; i < b; i++){
             boolean found = false;
             for (int k : arr) {
                 if (k == i) {
                     found = true;
                     break;
                 }
             }
             if(!found){
                 return false;
             }
         }
         return true;
     }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int a = 7;
        int b = 9;
        if(elementInRange(arr, b, n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
