import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (tối đa 3 chữ số): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {
            readSingleDigit(number);
        } else if (number < 20) {
            readLessThanTwenty(number);
        } else if (number < 100) {
            readTwoDigits(number);
        } else {
            readThreeDigits(number);
        }
    }

    public static void readSingleDigit(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                break;
        }
    }

    public static void readLessThanTwenty(int number) {
        switch (number) {
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
            default:
                break;
        }
    }

    public static void readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        switch (tens) {
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
            default:
                break;
        }

        readSingleDigit(ones);
    }

    public static void readThreeDigits(int number) {
        int hundreds = number / 100;
        int remainder = number % 100;

        readSingleDigit(hundreds);
        System.out.print(" hundred ");

        if (remainder != 0) {
            readTwoDigits(remainder);
        }
    }
}