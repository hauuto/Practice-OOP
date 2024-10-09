package iuh.fit.bai03.entity;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang(){
        super();
        this.loaiVang = "";
    }
    public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang){
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoatVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    //methods
    @Override
    public double getThanhTien(){
        return this.soLuong * this.donGia;
    }
}
