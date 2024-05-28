public class Bai25Ham {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3};
        int[] mang2 = {4, 5, 6};
        int[] mang3 = {7, 8, 9};
        int[] mangGop = gopBaMang(mang1, mang2, mang3);

        for (int i = 0; i < mangGop.length; i++) {
            System.out.print(mangGop[i] + " ");
        }
    }

    public static int[] gopBaMang(int[] mang1, int[] mang2, int[] mang3) {
        int[] mangGop = new int[mang1.length + mang2.length + mang3.length];

        int index = 0;

        for (int i = 0; i < mang1.length; i++) {
            mangGop[index] = mang1[i];
            index++;
        }

        for (int j = 0; j < mang2.length; j++) {
            mangGop[index] = mang2[j];
            index++;
        }

        for (int k = 0; k < mang3.length; k++) {
            mangGop[index] = mang3[k];
            index++;
        }

        return mangGop;
    }
}


