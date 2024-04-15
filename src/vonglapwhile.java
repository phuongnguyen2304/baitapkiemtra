import java.util.Scanner;

public class vonglapwhile {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("enter a number : ");
            number = scanner.nextInt();
            sum+= number ;

        }while(number !=1);
        System.out.println("the sum ís : "+sum );


    }
    }










