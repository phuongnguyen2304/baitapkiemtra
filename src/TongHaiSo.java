public class TongHaiSo {
    public static void main(String[] args) {
        String [] tenThanhVien = {"Anh ","Bao Khanh ","Trang ","Anh Can ","Sam"};
        showValueInArrays(tenThanhVien);
        showValueInArrays(tenThanhVien);
        showValueInArrays(tenThanhVien);
        showValueInArrays(tenThanhVien);
        showValueInArrays(tenThanhVien);
    }
    public static void showValueInArrays(String[] inputArray){
        for (int i = inputArray.length-1 ; i >= 0 ; i-- ){
            System.out.println(inputArray[i]);
        }
        System.out.println();
    }
}
