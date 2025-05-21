package baitap;

public class Main {
    public static void main(String[] args) {
    VanPhong nv1 = new VanPhong();
    nv1.Hoten = "Nobita";
    nv1.ngaySinh = 2004;
    nv1.luongCoBan = 3000000;
    nv1.soNgayLamViec = 30;
    nv1.heSoPhuCap = 3;

    SanXuat nv2 = new SanXuat();
    nv2.Hoten = "Doraemon";
    nv2.ngaySinh = 2005;
    nv2.luongCoBan = 2600000;
    nv2.soSanPham = 200;

    nv1.hienThiThongTin();
    nv2.hienThiThongTin();


    }


}
