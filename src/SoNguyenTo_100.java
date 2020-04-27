public class SoNguyenTo_100 {
    public static void main(String[] args) {
        boolean check=false;
        String result="";
        for (int i =2;i<100;i++){
            if (check=CheckNumber(i)){
                result+=i+"-";
            }
        }
        System.out.println("Số Nguyên Tố Nhỏ Hơn 100 là : "+result);
    }
    public static boolean CheckNumber(int x){
        if (x<2){
            return false;
        }else {
            for (int i=2;i<x-1;i++){
                if (x%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
