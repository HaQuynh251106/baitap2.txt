package baitap;

public class SanXuat extends NhanVien {
    int soSanPham;
    int Luong;

    int tinhLuong(){
        Luong = luongCoBan + soSanPham* 50000;
        return Luong;
    }

    void hienThiThongTin(){
        System.out.println("Nhân viên: " + Hoten + " Năm sinh: " + ngaySinh + " Lương: " + tinhLuong());
    }
}
