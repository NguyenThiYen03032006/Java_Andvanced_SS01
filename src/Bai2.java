import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao tong so nguoi");
        int tn=sc.nextInt();
        System.out.println("Nhap vao so nhom muon chia");
        int sn=sc.nextInt();
        try{
            int a=tn/sn;
            System.out.println("So nhom co so nguoi la: "+a);
        }catch(ArithmeticException e){
            System.out.println("Khong the thuc hien phep chia");
        }finally {
            sc.close();
        }
    }
}
