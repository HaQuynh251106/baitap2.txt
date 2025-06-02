package asm7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<KhachHang> ds = new ArrayList<>();

        // Thêm khách hàng mẫu
        ds.add(new KhachHangVietNam("VN001", "Nguyễn Văn A", LocalDate.of(2019, 1, 15), 120, "sinh hoạt", 100));
        ds.add(new KhachHangVietNam("VN002", "Trần Thị B", LocalDate.of(2019, 2, 5), 80, "kinh doanh", 100));
        ds.add(new KhachHangNuocNgoai("NN001", "John Smith", LocalDate.of(2019, 1, 10), 150, "USA"));
        ds.add(new KhachHangNuocNgoai("NN002", "Maria Lopez", LocalDate.of(2019, 3, 20), 200, "Spain"));

        // Xuất danh sách
        System.out.println("==== DANH SÁCH HÓA ĐƠN ====");
        for (KhachHang kh : ds) {
            kh.hienThi();
        }

        // Tính tổng số lượng
        int tongVN = 0, tongNN = 0;
        double tongTienNN = 0;
        int countNN = 0;

        for (KhachHang kh : ds) {
            if (kh instanceof KhachHangVietNam) {
                tongVN += kh.soLuong;
            } else {
                tongNN += kh.soLuong;
                tongTienNN += kh.thanhTien();
                countNN++;
            }
        }

        System.out.println("\nTổng số lượng khách Việt Nam: " + tongVN);
        System.out.println("Tổng số lượng khách Nước ngoài: " + tongNN);

        // Trung bình thành tiền khách nước ngoài
        if (countNN > 0) {
            System.out.println("Trung bình thành tiền khách nước ngoài: " + (tongTienNN / countNN));
        }

        // Xuất hóa đơn tháng 01/2019
        System.out.println("\n==== HÓA ĐƠN THÁNG 01/2019 ====");
        for (KhachHang kh : ds) {
            if (kh.getNgayHoaDon().getMonthValue() == 1 && kh.getNgayHoaDon().getYear() == 2019) {
                kh.hienThi();
            }
        }
    }
}

