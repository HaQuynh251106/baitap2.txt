package asm7;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngay, int soLuong, String quocTich) {
        super(maKH, hoTen, ngay, soLuong);
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien() {
        return soLuong * DON_GIA[0]; // đơn giá mặc định
    }

    @Override
    public void hienThi() {
        System.out.printf("NN | Mã: %s | Tên: %s | Ngày: %s | Quốc tịch: %s | SL: %d | Tiền: %.0f\n",
                maKH, hoTen, ngayHoaDon, quocTich, soLuong, thanhTien());
    }
}


