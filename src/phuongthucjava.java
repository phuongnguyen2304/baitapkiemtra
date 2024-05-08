public class phuongthucjava {
    public static void main(String[] args) {
        phuongthucjava (2000,3000);
    }
    public static void
    phuongthucjava(int startYear , int endYear ){
        for (int year = startYear ; year<= endYear ; year++){
            if (isphuongthucjava(year)){
                System.out.println(year);

            }
        }
    }
    public static boolean
    isphuongthucjava(int year ){
        return (year % 4 == 0 && year % 100!=0) || (year % 400 == 0 );
    }
}
