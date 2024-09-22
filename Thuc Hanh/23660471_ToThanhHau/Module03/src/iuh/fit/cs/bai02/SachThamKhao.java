package iuh.fit.cs.bai02;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
    private double thue;

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        setThue(thue);
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    //Methods

    public double thanhTien(){
        return getSoLuong()*
    }
}
