public class xoaphantumang {
    public static void main(String[] args) {
//        int [] array = {3,6,8,9,5,4,2,5,7,4,1,2,2};
//        int [] array1 = new int[array.length-1] ;
//        array1[0] = array[0];
//        array1[1] = array[1];
//        for(int i=0; i<array1.length; i++) {
//            array1[i] = array[i];
//        }
//        for(int i=0; i<array1.length; i++) {
//            System.out.print(array1[i] + "  ");
//        }

        // BÀI 21 : VIẾT 1 HÀM ĐỂ XÓA PHẦN TỬ CUỐI MẢNG
        int [] array = {3, 6 , 8 , 9 , 5 , 4 , 2 , 5 , 7 , 4 , 1 , 2 };
        int [] array1 = newarray(array);
        for (int i = 0 ; i < array1.length ; i++){
            System.out.println(array1[i]);
        }
    }
    public static int[]newarray(int [] array){
        int[] array1 = new int[array.length-1];
        for (int i = 0 ; i < array1.length ; i++){
            array1[i] = array[i] ;

        }
        return array1 ;
    }
}
