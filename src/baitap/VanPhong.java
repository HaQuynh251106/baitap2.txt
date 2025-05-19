package baitap;

public class VanPhong extends NhanVien {
    int soNgayLamViec;
    int heSoPhuCap;
    int Luong;

    int tinhLuong(){
        Luong = luongCoBan + soNgayLamViec * 100000 + heSoPhuCap * 500000;
        return Luong;
    }

    void hienThiThongTin(){
        System.out.println("Nhân viên: " + Hoten + " Năm sinh: " + ngaySinh + " Lương: " + tinhLuong());
    }
}
