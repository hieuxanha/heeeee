import java.util.Scanner;

public class vd_4bai20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a :");
        double a =sc.nextDouble();
        System.out.println("nhap b:");
        double b=sc.nextDouble();
        // tạo scanner moi
        Scanner scc=new Scanner(System.in);
        System.out.println("moi nhap ");
        String phep=scc.nextLine();
        switch(phep){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case"/":
                chia(a,b);
                break;
            default:
                System.out.println("mời nhập lại ");
                break;
        }

    }



    public static void cong(double a,double b){
        double kq = a+b;
        System.out.println("ket qua :"+kq);
    }

    public static void tru(double a, double b){
        double kq=a-b;
        System.out.println("ket qua :"+kq);
    }

    public static void nhan(double a,double b){
        double kq=a*b;
        System.out.println("ket qua : "+kq);
    }

    public static void chia(double a,double b){
        if(b==0)
            System.out.println("lỗi nhập lại !!!!!!!!");
            else{
            double kq=a/b;
            System.out.println("ket qua "+kq);
        }

    }
}
