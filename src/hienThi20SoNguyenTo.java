public class hienThi20SoNguyenTo {
    public static void main(String[] args) {
    int x = 0;
    int number = 2;

    while(x < 20){
        boolean check = true;

        for(int i = 2; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                check = false;
                break;
            }

        }
        if(check){
            System.out.println(number);
            x++;
        }
        number++;

        }

    }
}
