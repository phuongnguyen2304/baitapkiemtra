import java.util.Scanner;

public class giatrinhonhatmang {
    public static void main(String[] args) {
     int []phantu = new int[5];
     Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap gia tri vao mang");
        for(int i = 0 ; i<phantu.length;i++){
            int number = scanner.nextInt();
            phantu[i] = number;

        }
       int min = phantu[0];
        for (int i = 1 ; i<phantu.length;i++){
            if(min>phantu[i]) {
                min=phantu[i];
            }
        }
        System.out.print("phan tu nho nhat la "+min);





    }
}
