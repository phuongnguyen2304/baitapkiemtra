import java.util.Scanner;

public class cautrucvonglap2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int expectedAnswer = input.nextInt();
        while (number1 + number2!= expectedAnswer){
            System.out.println("Wrong answer ");
            expectedAnswer = input.nextInt();
        }
        System.out.println("you got it !");
    }
}
