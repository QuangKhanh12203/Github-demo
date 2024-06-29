
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("MENU");
        System.out.println("1.Đổi từ feet sang meter ");
        System.out.println("2.Đổi từ meter sang feet ");
        System.out.println("3.Đổi từ phút sang ms ");
        System.out.println("4.Đổi từ ms sang phút ");
        System.out.println("5. Thoát ");
        System.out.println("Chọn menu(1/2/3/4/5 để kết thúc chương trình, rồi enter ");
        n = sc.nextInt();
        DoDai dd = new DoDai(1, 1);
        ThoiGian tg = new ThoiGian(1, 1);
        
        if (n>5){
            System.out.println("Nhập sai ");
            System.out.println("Vui lòng nhập lại " );
            n = sc.nextInt();
        }
        if (n==1) {
            System.out.println("Nhập số feet rồi enter : " );
            double sofeet = sc.nextDouble();
            dd.setFeet(sofeet);
            System.out.println("Số meter là: " + dd.chuyenDoi());
            }
        if (n==2){
            System.out.println("Nhập số meter rồi enter : " );
            double someter = sc.nextDouble();
            dd.setMeter(someter);
            System.out.println("Số feet là: " + dd.chuyenDoiNguocLai());
            } 
        if (n==3){
            System.out.println("Nhập số phút rồi enter ");
            double soPhut = sc.nextDouble();
            tg.setPhut(soPhut);
            System.out.println("số miligiay là: " +tg.chuyenDoi());
            }
        if (n==4){
            System.out.println("Nhập số miligiay rồi enter ");
            double soMiliGiay = sc.nextDouble();
            tg.setMiliGiay(soMiliGiay);
            System.out.println("Số phút là: "+ tg.chuyenDoiNguocLai());
            }
        if (n==5){
            System.out.println("Kết thúc chương trình "); 
        }
       
    }
        
}

    

    
    

