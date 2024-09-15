package Arrays;

public class RepeatingElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,7};
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Index "+i+ " is repeating index.");
                    System.out.println("The first repeating elements is " + arr[i]+".");
                    break;
                }
            }
        }
    }

}
