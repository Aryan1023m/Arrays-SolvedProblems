package Arrays;

public class NonRepeatingElement {
    public static int nonRepeatingElement(int arr[], int n){

        for(int i = 0; i < n; i++){
            boolean isUnique = true;
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(arr[i]);
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-3,2,-3,1,2};
        int n = arr.length;
        nonRepeatingElement(arr,n);

    }
}
