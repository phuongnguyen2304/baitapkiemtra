package Ham;

public class Bai12 {
    public static void main(String[] args) {
        int[] array = {4 , 7 , 9};
        System.out.println(average(array));

    }
    public static double average(int[] a ){
        double sum = 0 ;
        for (int i = 0 ; i < a.length ; i++){
            sum += a[i] ;
        }
        return sum/a.length ;
    }

}

