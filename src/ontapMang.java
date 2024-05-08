public class ontapMang {
    public static void main(String[] args) {
       // int [] arrays = {1, 6 , 5 , 2 , 3 , 3 , 6 , 4 , 1 , 8 };
     //   System.out.println(arrays[1]);
       // for (int i = 1 ; i<arrays.length; i++){
            // System.out.println(arrays[i]);

      //   }



        int [] array = {1 , 2 , 3 , 4 , 5  };
       // for (int i = 0 ; i <= array.length-1 ; i++){
           // System.out.print(array[i] + "    ");
       // }


       // int i = 0 ;
       // while (i <= array.length-1){

          //  System.out.print(array[i] + "     ");
          //  i++ ;
       // }


        int sum = 0 ;
        int multilResult = 1 ;
       for (int i = 0 ; i<= array.length-1;i++ ){
           sum += array[i];
           multilResult *= array[i];


       }
        System.out.println(  "tổng là " + sum);
        System.out.println(" tích là " + multilResult);



    }

}
