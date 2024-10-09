package iuh.fit.bai03.test;
import iuh.fit.bai03.entity.*;
import java.time.LocalDate;
import iuh.fit.bai03.manager.*;

public class LopKIemNghiem {
    public static void main (String[] args){

        //Tao Giao Dich
        GiaoDichVang gdv1 = new GiaoDichVang("GD001", java.time.LocalDate.now(), 100, 10, "18k");
        GiaoDichVang gdv2 = new GiaoDichVang("GD002", java.time.LocalDate.now(), 200, 20, "24k");
        GiaoDichVang gdv3 = new GiaoDichVang("GD003", java.time.LocalDate.now(), 300, 30, "9999");

        GiaoDichTienTe gdtt1 = new GiaoDichTienTe("GD004", java.time.LocalDate.now(), 100, 10, 23000, LoaiTienTe.USD);
        GiaoDichTienTe gdtt2 = new GiaoDichTienTe("GD005", java.time.LocalDate.now(), 200, 20, 28000, LoaiTienTe.Euro);
        GiaoDichTienTe gdtt3 = new GiaoDichTienTe("GD006", java.time.LocalDate.now(), 300, 30, 1, LoaiTienTe.VN);


        //Danh Sach Giao Dich
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        danhSachGiaoDich.themGiaoDich(gdv1);
        danhSachGiaoDich.themGiaoDich(gdv2);
        danhSachGiaoDich.themGiaoDich(gdv3);
        danhSachGiaoDich.themGiaoDich(gdtt1);
        danhSachGiaoDich.themGiaoDich(gdtt2);
        danhSachGiaoDich.themGiaoDich(gdtt3);







    }
}
