import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. In ra hinh chu nhat.");
        System.out.println("2. In ra hinh tam giac vuong.");
        System.out.println("3. In ra hinh tam giac can.");
        System.out.println("Moi ban chon menu.");
        int choose = scanner.nextInt();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1 ; i <= 6 ; i++){
            for (int j = 1 ; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for(int i = 1; i <= 7; i++){
            for(int j = i; j < 7; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
    }



