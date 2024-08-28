import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class KhachHang {
    private String maKhachHang;
    private String hoTenChuHo;
    private int soNha;
    private String maCongTo;

    public KhachHang() {}

    public KhachHang(String maKhachHang, String hoTenChuHo, int soNha, String maCongTo) {
        this.maKhachHang = maKhachHang;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    // Getter and Setter methods
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        maKhachHang = scanner.nextLine();
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTenChuHo = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha = scanner.nextInt();
        scanner.nextLine();

        // Consume newline character
        System.out.print("Nhập mã số công tơ: ");
        maCongTo = scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maCongTo);
    }
}
class loicongto extends Exception{
    public loicongto(String aa){
        super(aa);
    }


}

class HoaDon extends KhachHang {
    private int chiSoMoi;
    private int chiSoCu;
    private int thangSuDung;

    public HoaDon() {}

    public HoaDon(String maKhachHang, String hoTenChuHo, int soNha, String maCongTo,
                  int chiSoMoi, int chiSoCu, int thangSuDung) {
        super(maKhachHang, hoTenChuHo, soNha, maCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.thangSuDung = thangSuDung;
    }

    // Getter and Setter methods
    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getThangSuDung() {
        return thangSuDung;
    }

    public void setThangSuDung(int thangSuDung) {
        this.thangSuDung = thangSuDung;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi = scanner.nextInt();
        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu = scanner.nextInt();

        System.out.print("Nhập tháng sử dụng: ");
        thangSuDung = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Tháng sử dụng: " + thangSuDung);
        System.out.println("Số tiền phải trả: " + tinhTienDien());
    }

    public double tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 850;
    }
}


public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng hóa đơn: ");
        int n = scanner.nextInt();
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            HoaDon hoaDon = new HoaDon();
            System.out.println("Nhập thông tin hóa đơn thứ " + (i + 1) + ":");

            hoaDon.input();
            danhSachHoaDon.add(hoaDon);
        }

        // Hiển thị thông tin các hóa đơn
        System.out.println("Thông tin các hóa đơn:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.output();
            System.out.println();
        }

        // Tìm kiếm hóa đơn cho một khách hàng
        scanner.nextLine(); // Consume newline character
        System.out.print("Nhập mã khách hàng cần tìm: ");
        String maKhachHangTimKiem = scanner.nextLine();
        System.out.println("Các hóa đơn của khách hàng có mã " + maKhachHangTimKiem + ":");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.getMaKhachHang().equals(maKhachHangTimKiem)) {
                hoaDon.output();
                System.out.println();
            }
        }

        // Đưa ra danh sách những khách hàng sử dụng tiền điện > 2 triệu/tháng
        System.out.println("Các khách hàng sử dụng tiền điện > 2 triệu/tháng:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.tinhTienDien() > 2000000) {
                hoaDon.output();
                System.out.println();
            }
        }

        // Sắp xếp danh sách theo giảm dần của tiền điện
        Collections.sort(danhSachHoaDon, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon hoaDon1, HoaDon hoaDon2) {
                return Double.compare(hoaDon2.tinhTienDien(), hoaDon1.tinhTienDien());
            }
        });

        // Hiển thị danh sách đã sắp xếp
        System.out.println("Danh sách các hóa đơn sau khi sắp xếp theo giảm dần của tiền điện:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.output();
            System.out.println();
        }
    }
}
