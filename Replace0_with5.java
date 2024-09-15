package Arrays;

public class Replace0_with5 {
    public static void main(String[] args) {
        int arr[] ={1,0,0,7};

        Replace0(arr);
            for(int num: arr){
            System.out.println(num+" ");
        }

    }
    public static int Replace0(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 5;
            }
        }
        return -1;
    }
}
