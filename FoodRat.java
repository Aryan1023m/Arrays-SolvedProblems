package Arrays;

public class FoodRat {
    public static int min_house(int r, int unit, int[] arr){
        if(arr == null){
            return -1;
        }

        int total_need_of_food = r * unit;
        int total_available = 0;

        for(int i = 0; i < arr.length; i++){
            total_available += arr[i];
            if(total_available >= total_need_of_food){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int [] arr = {2,8,3,5,7,4,1,2};
        System.out.println(min_house(r,unit,arr));
    }
}
