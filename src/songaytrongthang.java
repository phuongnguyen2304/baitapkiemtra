import java.util.Scanner;

public class songaytrongthang {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("which month that you want to count days ?");
        int month = sc.nextInt();

        switch (month ){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :

                System.out.println("  co 31 ngay ");
                break ;
            case 2 :
                System.out.println("co 28 or 29 ");
                break ;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("co 30 ngay ");
                break ;

        }
    }
}
