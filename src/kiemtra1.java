public class kiemtra1 {
    public static void main(String[] args) {
        // bài 1 : khai báo biến số nguyên
       // int number = 1 ;
     //   System.out.println(number);



        // bài 2 : khai báo biến số thực :
       //  double number = 23.7 ;
       //  System.out.println(number );

        // bài 3 : khai báo biến kiểu boolean :
        // boolean num = true ;

        // bài 4 : khai báo biến kiểu ký tự :
     //   char hi =  ' a ';
      //  System.out.println(hi );

        // bài 5 : khai báo biến kiểu chuỗi :
        // String hi = " hello word ";
      //   System.out.println(hi );

        // bài 9 : hãy sử dụng vòng lặp for in ra các số từ 1 - 5 :
       // for (int i = 1 ; i<= 5 ; i++ ){
          //  System.out.println(i);
   //     }

        // bài 13 : sử dụng vòng lặp for in ra các số chẵn từ 15 - 25 :
        // for (int i = 15 ; i <= 25 ; i++){
          //   if (i % 2 == 0 ){
               //  System.out.println(" số chẵn là " + i );
         //    }
      //   }

        // bài 11 : sử dụng vòng lặp for in ra bảng cửu chương 5 :
       //  int number = 5 ;
      //  for (int i = 1 ; i <= 10 ; i++){

          //  System.out.println( "5 x =  " + number );
          //  number = 5 * i ;

      //  }

        // bài 14 : hãy khai bso vaf khởi tạo mảng số nguyên gồm 5 phần tử bất kỳ :
        int [] number = {23 , 9 , 6 , 7 ,20 };

        // bài 15 : truy cập phần tử thứ 1 và 4 của mảng :
    //    System.out.println(number[0]);
    //    System.out.println(number[3]);

        // bài 16 : sử dụng vòng lặp for duyệt mảng :
      //  for (int i = 0 ; i < number.length ; i++){
        //    System.out.println(number[i]);
     //   }

        // bài 17 : tính tổng các phần tử của mảng :
        int sum = 0 ;
        for (int i = 0 ; i <= number.length - 1  ; i++){
            sum += number[i] ;


        }
        System.out.println("tổng là "+ sum);






        }
    }

