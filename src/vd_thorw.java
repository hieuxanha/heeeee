import java.util.Scanner;

public class vd_thorw {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String name = "";
        int birthYear = 0;

        while (true) {
            try {
                System.out.print("Nhập họ tên (không quá 25 ký tự): ");
                name = scanner.nextLine();
                if (name.length() > 25) {
                    throw new IllegalArgumentException("Họ tên không được quá 25 ký tự.");
                }

                System.out.print("Nhập năm sinh (1990 - 1995): ");
                birthYear = Integer.parseInt(scanner.nextLine());
                if (birthYear < 1990 || birthYear > 1995) {
                    throw new IllegalArgumentException("Năm sinh phải trong khoảng từ 1990 đến 1995.");
                }

                break; // Nếu dữ liệu nhập hợp lệ, thoát khỏi vòng lặp
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên cho năm sinh.");
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        System.out.println("Họ tên: " + name);
        System.out.println("Năm sinh: " + birthYear);

        scanner.close();
    }
}
