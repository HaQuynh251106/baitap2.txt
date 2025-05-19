package baitap;

import org.w3c.dom.ls.LSOutput;

public class NhanVien {
    String Hoten;
    int ngaySinh;
    int luongCoBan;

    int tinhLuong(){
        return luongCoBan;
    }

    void hienThiThongTin() {
        System.out.println("Nhân viên: " + Hoten + " Năm sinh: " + ngaySinh + "Lương: " + luongCoBan);
    }
}
