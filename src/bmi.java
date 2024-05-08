public class bmi {
    public static void main(String[] args) {
       double bmi = 25.0 ;
        if (bmi < 18.5 ){
            System.out.println("bạn thiếu cân ");
        }else if (bmi <=25.0){
            System.out.println("bạn bình thường ");
        }else if (bmi <= 30.0){
            System.out.println("bạn thừa cân ");
        }else if (bmi >=30.0){
            System.out.println("bạn béo phì ");
        }
    }
}
