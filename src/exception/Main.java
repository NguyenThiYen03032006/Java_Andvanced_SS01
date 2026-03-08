package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       MyUncheckedException un=new MyUncheckedException("");
//       MyCheckedException ex=new MyCheckedException("");
//       Exception e=new Exception();
        // try with resouce (tu dong sau khi xong try catch) tu java 7
        try(// cac bien xly tai nguyen (ko co logic)
            Scanner sc=new Scanner(System.in);
            )
        {
            // khoi code sinh ra loi
            int value=Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }// ko can finally
        int age=Ex.inputPositive("Nhap tuoi cua ban");
      // inputInteger();
    }

    public static int inputInteger (){
        Scanner sc= new Scanner(System.in);
        // nhap khi nao thoa man la so nguyen
        while (true){
            try {
                // khoi code sinh ra ngoai le
                System.out.println("Nhap 1 so nguyen");
                int a=sc.nextInt();
                return a;
            }catch (InputMismatchException ex){// ten ngoai le muon bat
                // logic xly ngoai le
                //System.out.println("Bn phai nhap so nguyen");
                // in stack lỗi
                ex.printStackTrace();
                // in noi dung loi
                //System.out.println(ex.getMessage());
                // nem ra 1 loi khac
                throw new RuntimeException("Loi moi");
            }finally {
                System.out.println("Ket thuc xu ly");

            }
        }

    }
}