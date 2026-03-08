package exception;

import java.util.Scanner;

public class Ex {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        System.out.println("""
                Tạo ra phương thức nhập và trả về các giá trị gồm
                1. Số nguyên (int ,byte,short,long)
                2. Số thực(double,float)
                3. Ký tự và chuỗi
                4.Boolean
                Lưu ý xử lý hết lỗi(ngoại lệ) sinh ra khi nhập, nếu không đúng thì nhập lại
                """);
//        int a=checkSN(sc);
//        double d=checkST(sc);
//        String s=checkStr(sc);
//        boolean b=checkBoolean(sc);
//        System.out.println("Ban da nhap so nguyen "+a);
//        System.out.println("Ban da nhap so thuc "+d);
//        System.out.println("Ban da nhap chuoi "+s);
//        System.out.println("Ban da nhap boolean "+b);


    }
//    public static int checkSN(Scanner sc){
//        while (true){
//            try{
//                System.out.println("Nhap vao 1 so nguyen");
//                int a=Integer.parseInt(sc.nextLine());
//                return a;
//            } catch (Exception e) {
//                System.out.println("Ban nhap sai dinh dang!! \nVui long nhap 1 so nguyen ");
//            }
//        }
//    }
//
//    public static double checkST(Scanner sc){
//        while (true){
//            try{
//                System.out.println("Nhap vao 1 so thuc");
//                double a=Double.parseDouble(sc.nextLine());
//                return a;
//            } catch (Exception e) {
//                System.out.println("Ban nhap sai dinh dang!! \nVui long nhap 1 so thuc");
//            }
//        }
//    }
//    public static String checkStr(Scanner sc){
//        while (true){
//            try{
//                System.out.println("Nhap vao 1 ky tu hoac chuoi");
//                String a=sc.nextLine();
//                return a;
//            } catch (Exception e) {
//                System.out.println("Ban nhap sai dinh dang!! \nVui long nhap 1 so nguyen ");
//            }
//        }
//    }
//    public static boolean checkBoolean(Scanner sc){
//        while (true) {
//            try {
//                System.out.print("Nhập true hoặc false: ");
//                boolean b = sc.nextBoolean();
//                return b;
//            } catch (Exception e) {
//                System.out.println("Lỗi! Phải nhập true hoặc false.");
//                sc.nextLine();
//            }
//        }
//    }
    private static Scanner input(){
        return new Scanner(System.in);
    }
    public static int inputPositive(String title){
        System.out.println(title);
        while (true){
            try {
                int value=Integer.parseInt(input().nextLine());
                return value;
            }catch(NumberFormatException e){
                System.out.println("Phai nhap 1 so nguyen");
            }
        }
    }
}
