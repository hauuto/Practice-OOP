package iuh.fit.bai03.manager;
import iuh.fit.bai03.entity.*;
public interface iGiaoDich{
    boolean themGiaoDich(GiaoDich gd);
    boolean xoaGiaoDich(GiaoDich gd);
    boolean suaGiaoDich(GiaoDich gd);
    GiaoDich timGiaoDich(String maGiaoDich);
    void tongGiaoDichCacLoai();
    double trungBinhThanhTien();
    void giaoDichCoThanhTienHon1Ty();

}
