public class tinhtiendien {
    public static void main (String[]args){
        int soKWh = 250 ;
        double giaBac1 = 1.678 ;
        double giaBac2 = 1.734 ;
        double giaBac3 = 2.014 ;
        double giaBac4 = 2.536 ;
        double giaBac5 = 2.834 ;
        double giaBac6 = 2.927 ;
        double tienDien = 0 ;
        if (soKWh <=50){
            tienDien = soKWh * giaBac1 ;
        }else if
        (soKWh <=100){
            tienDien = 50*giaBac1+(soKWh-50)*giaBac2;
        }else if
        (soKWh <= 200 ){
            tienDien = 50 * giaBac1 + 50 * giaBac2 + (soKWh - 100)* giaBac3 ;
        }else if
        (soKWh <=300){
            tienDien = 50 * giaBac1 + 50 * giaBac2 + 100 * giaBac3 + (soKWh -200)*giaBac4 ;
        }else if
        (soKWh <= 400 ){
            
        }
    }
}
