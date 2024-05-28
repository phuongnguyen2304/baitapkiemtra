import java.util.Scanner;

public class Bai6Ham {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số");
//        int number = scanner.nextInt();
//        int a = numbers(number);
//        System.out.println(a);
//    }
//    public static int numbers(int a){
//        int b = 1 ;
//        for (int i = 1 ; i <=a ; i++){
//            b *= i ;
//
//        }
//        return b ;

        // bài 5 : viết 1 hàm để tính lũy thừa của 1 số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số nguyên");
        int a = scanner.nextInt();
        System.out.println(" nhập lũy thừa");
        int b = scanner.nextInt();
        int c = numbers(a,b);
        System.out.println(c);


    }
    public static int numbers(int a , int b ){
        int ketqua = 1 ;
        for (int i = 1 ; i<= b; i++){
            ketqua *= a ;
        }
        return ketqua ;


    }
}
