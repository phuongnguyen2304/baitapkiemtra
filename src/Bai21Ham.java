public class Bai21Ham {
    public static void main(String[] args) {
        int [] array = {2 , 3 , 5 , 6 , 7 , 77 , 88 , 1};
        int [] array1 = newArray(array);
        for (int i = 0 ; i < array1.length ; i++){
            System.out.println(array1[i]);
        }
    }
    public static int [] newArray(int [] array){
        int [] array1 = new int[array.length-1];
        for (int i = 0 ; i < array1.length ; i++ ){
            array1[i] = array[i];
        }
        return array1 ;
    }
}
