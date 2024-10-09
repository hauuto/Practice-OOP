package iuh.fit.bai03.entity;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
    private double tiGia;
    private LoaiTienTe loaiTien;

    public GiaoDichTienTe(){
        super();
        this.tiGia = 0;
        this.loaiTien = LoaiTienTe.VN;
    }

    public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia, LoaiTienTe loaiTien){
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    //getters and setters
    public double getTiGia() {
        return tiGia;
    }
    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }
    public LoaiTienTe getLoaiTien() {
        return loaiTien;
    }
    public void setLoaiTien(LoaiTienTe loaiTien) {
        this.loaiTien = loaiTien;
    }

    //methods
    @Override
    public double getThanhTien(){
        switch(this.loaiTien){
            case USD:
                return this.soLuong * this.donGia * this.tiGia;
            case Euro:
                return this.soLuong * this.donGia * this.tiGia;
            case VN:
                return this.soLuong * this.donGia;
            default:
                return 0;
        }
    }
}
