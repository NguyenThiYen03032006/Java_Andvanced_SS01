import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Nhap nam sinh cua ban: ");
                int year=Integer.parseInt(sc.nextLine());
                if (year<1908){
                    System.out.println("Nam sinh khong hop le ( nguoi tho nhat hien nay sinh nam 1908)");
                }else if (year>2026){
                    System.out.println("Hien nay la nam 2026 ! Nam sinh cua ban khong hop le");
                }else {
                    System.out.println("Tuoi hien tai cua ban la: "+ (2026-year));
                    return;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai dinh dang!! Nhap lai ");
            }
        }

    }
}
