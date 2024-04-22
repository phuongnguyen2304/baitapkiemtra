public class gopmang {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3, 4, 5, 6};
        int[] mang2 = {33, 22, 66, 78, 9, 8};
        int[] mang3 = new int[mang1.length + mang2.length];

//        System.out.println("\nmang 1 là :");
//        for (int i = 0; i < mang1.length; i++) {
//            System.out.print(mang1[i] + " ");
//        }
//        System.out.println("\nmang 2 là :");
//        for (int i = 0; i < mang2.length; i++) {
//            System.out.print(mang2[i] + " ");
//        }
//
//        System.out.println("\nMang sau khi gộp là:");

        int index = 0;

        for (int i = 0; i < mang1.length; i++) {
            mang3[index] = mang1[i];
            index++;
        }

        for (int j = 0; j < mang2.length; j++) {
            mang3[index] = mang2[j];
            index++;
        }


        for (int i = 0; i < mang3.length; i++) {
            System.out.print(mang3[i] + " ");
        }
    }
}
