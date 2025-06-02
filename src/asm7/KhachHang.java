package asm7;

import java.time.LocalDate;

public abstract class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected LocalDate ngayHoaDon;
    protected int soLuong;
    protected static final int[] DINH_MUC = {50, 100, 200};
    protected static final int[] DON_GIA = {1000, 1200, 1500, 2000};

    public KhachHang(String maKH, String hoTen, LocalDate ngayHoaDon, int soLuong) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuong = soLuong;
    }

    public LocalDate getNgayHoaDon() {
        return ngayHoaDon;
    }

    public abstract double thanhTien();

    public abstract void hienThi();
}
