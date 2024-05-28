public class KiemTraHam {
    public static void main(String[] args) {
        // bài 1 :Viết một hàm để tính tổng của hai số nguyên.
//        System.out.println(sum(10,3));
//
//    }
//    public static int sum(int a1 , int a2){
//      int   result = a1 + a2 ;
//        return result ;

        // bài 2 :Viết một hàm để tính tích của hai số nguyên.
//        int result = number(6,9);
//        System.out.println(result);
//
//    }
//
//    public static int number(int a , int b ){
      //  int result = a * b ;
//        return a * b  ;

        // bài 3 :Viết một hàm để tính hiệu của hai số nguyên.
//        int result = number(9 , 6);
//        System.out.println(result);
//
//
//    }
//    public static int number(int a1 , int b1){
//        return a1 - b1 ;

        // bài 4 : Viết một hàm để tính thương của hai số nguyên.
//        int result = number(6,2);
//        System.out.println(result);
//
//    }
//    public static int number (int a , int b ){
//        return a / b ;


        // bài 6 : Viết một hàm để tính giai  thừa của một số nguyên.
//       System.out.println(number(5 ));
//   }
//   public static int number(int a  ){
//       int result = 1 ;
//       for (int i = 1 ; i <= a ; i++ ){
//           result *= i ;
//
//       }
//
//       return result ;

        // bài 5 : Viết một hàm để tính lũy thừa của một số nguyên.
//        System.out.println(number(2 , 4));
//    }
//    public static int number(int a , int n ){
//        int result = 1 ;
//        for (int i = 1 ; i <= n ; i++){
//            result  *= a ;
//        }
//        return result ;

// bài 6 : Viết một hàm để tính giai  thừa của một số nguyên.
//         int a = 4 ;
//        System.out.println(numbers(4));
//
//        }
//        public static int numbers(int number){
//        int result = 1 ;
//        for (int i = 1 ; i<= number ; i++){
//            result *= i ;
//        }
//        return result ;

        // bài 7 : Viết một hàm để kiểm tra xem một số có phải là số nguyên tố hay không.
       // int a = 5 ;
//        if (isPrime(15)){
//            System.out.println("day la so nguyen to");
//        }
//        else {
//            System.out.println("day khong phai so nguyen to ");
//        }
//
//
//    }
//    public static boolean isPrime(int number){
//        if (number < 2 ) return false ;
//        for (int i = 2 ; i < number - 1 ; i ++){
//            if (number %i == 0 ){
//                return false ;
//            }
//        }
//        return true ;

        // bài 8 : Viết một hàm để tính tổng của các số từ 1 đến n.
//        int n = 5 ;
//        System.out.println(sum(5));
//    }
//    public static int sum(int number){
//        int sum = 0 ;
//       for (int i = 1 ; i <= number ; i++ ){
//            sum += i ;
//        }
//        return sum ;

        // bài 9 : Viết một hàm để đảo ngược một chuỗi.
//        System.out.println(reverseString("phuong"));
//
//    }
//    public static String reverseString (String name ){
//        String result = "  ";
//        for (int i = name.length()-1 ; i>= 0 ; i--){
//            result += name.charAt(i) ;
//
//        }
//        return result ;

        // bài 10 : Viết một hàm để kiểm tra xem một chuỗi có phải là chuỗi Palindrome hay không.

//

        // bài 17 : Viết một hàm để thêm phần tử đầu mảng
//        String[] stringArray = {"duy", "tam", "phuong anh"};
//        String value = "hieu";
//
//        String[] resultArray = addElementToStartArray(stringArray, value);
//        for (String item: resultArray){
//            System.out.println(item);
//        }
//    }
//
//    public static String[] addElementToStartArray(String[] inputArray, String value) {
//        String[] newArray = new String[inputArray.length + 1];
//
//        newArray[0] = value;
//
////        System.arraycopy(inputArray, 0, newArray ,1, inputArray.length);
//        for (int i = 0; i < inputArray.length; i++) {
//            newArray[i+1] = inputArray[i];
//        }
//
//        return newArray;




//        int[] intArray = {23 , 6 , 9 };
//        int value = 7 ;
//        int[] resultArray = addElementToStartArray(intArray , value );
//        for (int item : resultArray){
//            System.out.println(item);
//        }
//
//
//    }
//    public static int[] addElementToStartArray(int[] intArray , int value){
//        int[] newArray = new int[intArray.length+1];
//        newArray[0] = value ;
//        System.arraycopy(intArray , 0 , newArray , 1 , intArray.length);
//        for (int i = 0 ; i < intArray.length ; i++){
//            newArray[i + 1 ] = intArray[i] ;
//        }
//        return newArray ;

        // bài 18 : viết 1 hàm để thêm phần tử cuối mảng :

//        int [] intArray = {23 , 6 , 9 };
//        int value = 7 ;
//        int[] resultArray = addElementToStartArray(intArray , value);
//        for (int item : resultArray){
//            System.out.println(item);
//        }
//    }
//    public static int[] addElementToStartArray(int[] intArray , int value){
//        int[] newArray = new int[intArray.length + 1];
//        newArray[0] = value ;
//
//        System.arraycopy(intArray , 0 , newArray , 0 , intArray.length);
//       newArray[newArray.length - 1 ] = value ;
//       return newArray ;




    }

}








