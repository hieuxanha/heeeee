public class vd_3 {
    public static void main(String[] args) {
        String kq=giaipt2(1,2,3);
        System.out.println(kq);


    }


    public static String giaipt2(double a,double b,double c) {
        // nếu a=0 thì py
        if (a == 0) {
            if (b == 0 && c == 0)
                return "pt bậc 2 v số nghiệm  ";
            else if (b == 0 && c!= 0) {
                return " pt bậc nhất có nghiệm ";
            } else
                return "pt bậc nhất nghiệm " + (c / b);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0)
                return "pt bậc 2 vn ";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "pt bậc 2 nghiệm kép x = " + x;
            } else {
                double x1 =(-b + Math.sqrt(delta)) / (2 * a);
                double x2 =(-b - Math.sqrt(delta)) / (2 * a);
                return "pt bậc 2 có 2 nghiệm pb x1 = " + x1 + ";x2= " + x2;
            }
        }
    }
}
