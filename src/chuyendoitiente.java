import java.util.Scanner;

public class chuyendoitiente {
    public static void main (String[] args){
        double vnd = 23000 ;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD :");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("giá trị VND : "+quydoi);
    }
}
