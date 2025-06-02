package asm7;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang {
    private String doiTuong; // sinh hoạt, kinh doanh, sản xuất
    private int dinhMuc;

    public KhachHangVietNam(String maKH, String hoTen, LocalDate ngay, int soLuong, String doiTuong, int dinhMuc) {
        super(maKH, hoTen, ngay, soLuong);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double thanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * DON_GIA[0];
        } else {
            int vuot = soLuong - dinhMuc;
            return dinhMuc * DON_GIA[0] + vuot * DON_GIA[getBacGia(vuot)];
        }
    }

    private int getBacGia(int vuot) {
        if (vuot < 50) return 0;
        if (vuot <= 100) return 1;
        if (vuot <= 200) return 2;
        return 3;
    }

    @Override
    public void hienThi() {
        System.out.printf("VN | Mã: %s | Tên: %s | Ngày: %s | Đối tượng: %s | SL: %d | Tiền: %.0f\n",
                maKH, hoTen, ngayHoaDon, doiTuong, soLuong, thanhTien());
    }
}

