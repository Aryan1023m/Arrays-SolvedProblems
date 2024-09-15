package Arrays;

public class Penalty {
public static int penalty(int[] car, int[] fine, int date, int n){
    int totfine = 0;
    if(date % 2 == 0){
        for(int i = 0; i < n; i++){
            if(car[i] % 2 != 0) {
                totfine += fine[i];
            }
        }
    }
    else{
        for(int i = 0; i < n; i++){

            if(car[i] % 2 == 0){
                totfine += fine[i];
            }
        }
    }
    return totfine;
}

    public static void main(String[] args) {
        int[] car ={1005,1006,1007,1008};
        int[] fine ={250, 300,350,400};
        int d = 12;
        int n = car.length;
        System.out.println(penalty(car,fine,d,n));
    }
}
