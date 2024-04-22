public class xoaphantukhoimang {
    public static void main(String[] args) {
      int [] mang1 = {3,5,76,82,23,17};
      int [] mang2 = {33,20,48,42,44,50};
      int [] mang3 = new int[mang1.length+mang2.length];
        System.out.print("mảng 1 là : " + "  ");
        for(int i = 0 ; i<mang1.length ; i++){
            System.out.print(mang1[i] + "  ");
        }
        System.out.print("mảng 2 là : " + "  ");
        for(int j = 0 ; j<mang2.length ; j++){
            System.out.print(mang2[j] + "  ");
        }
        System.out.println(" mảng sau khi gôpj là : " + "  ");
        int index = 0 ;
        for(int i = 0 ; i<mang1.length;i++){
            mang3[index] = mang1[i];
            index++ ;

        }
        for(int i = 0 ; i<mang2.length;i++){
            mang3[index] = mang2[i];
            index++;
        }
        for(int i = 0 ; i<mang3.length;i++){
            System.out.println(mang3[i] + "  ");
        }
    }
    }

