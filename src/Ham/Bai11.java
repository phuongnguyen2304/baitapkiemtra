package Ham;

public class Bai11 {
    public static void main(String[] args) {
       int[] mang = {4 , 6 , 7 , 23 , 7 };
        System.out.println(mang2(mang));

   }
    public static int mang2 (int[] number){
       int sum = 0 ;
       for(int i = 0 ; i < number.length ; i++){
           sum += number[i] ;
       }
       return sum  ;

    }
}
