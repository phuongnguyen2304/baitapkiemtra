import java.util.Scanner;

public class danhgiahocluc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("điểm chuyên cần ");
        double number = sc.nextDouble();
        System.out.println("điểm kiểm tra ");
        double number1 = sc.nextDouble();
        System.out.println("điểm thi học kỳ ");
        double number2 = sc.nextDouble();
        double diemTrungBinh = (number + number1 + number2)/3;
        System.out.println("Điểm trung bình của bạn là: ");
        System.out.println(diemTrungBinh);

        if(diemTrungBinh >= 8.5){
            System.out.println("Xếp loại A.");
        }else if(diemTrungBinh >= 7){
            System.out.println("xếp loại B . ");

        }else if(diemTrungBinh >= 5.5){
            System.out.println("xếp loại C . ");
        }else if(diemTrungBinh >=4){
            System.out.println("xêp loại D.");
        }else if (diemTrungBinh <4 ){
            System.out.println("xếp loại f ");
        }



    }
}
