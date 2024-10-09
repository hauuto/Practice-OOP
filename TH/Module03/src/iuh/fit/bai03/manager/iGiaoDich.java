package iuh.fit.bai03.manager;
import iuh.fit.bai03.entity.*;
public interface iGiaoDich {
    boolean themGiaoDich(GiaoDich gd);
    boolean xoaGiaoDich(GiaoDich gd);
    GiaoDich capNhatGiaoDich(GiaoDich gdThongTinMoi);

    int soLuongGiaoDichTheoLoai(String loaiGiaoDich);
    double trungBinhThanhTienTheoLoai(String loaiGiaoDich);
    double giaoDichLonHonX(double x);
}
