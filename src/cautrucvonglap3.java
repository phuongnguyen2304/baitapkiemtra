import java.util.Scanner;

public class cautrucvonglap3 {
    public static void main(String[] args) {
        int sum = 0 ;
        int number ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number :");
            number = scanner.nextInt();
            sum += number ;
        }while (number !=0);
        System.out.println("the sum is :" + sum );
    }
}
