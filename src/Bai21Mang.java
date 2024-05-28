public class Bai21Mang {
    public static void main(String[] args) {
        int[] array = { 1 , 2 , 4 , 5 , 6 , 4 , 3 , 33 , 55 , 23 , 49};
        int[] mang = arrayM(array);
        for(int i : mang){
            System.out.println(i);
        }

    }
    public static int[]  arrayM(int[] array){
       int[] array1 = new int[array.length-1];
       for (int i = 0 ; i < array1.length ; i++){
           array1[i] = array[i];
       }
       return array1 ;

    }
}
