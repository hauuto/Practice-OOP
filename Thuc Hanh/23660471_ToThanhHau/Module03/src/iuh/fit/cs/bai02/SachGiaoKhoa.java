package iuh.fit.cs.bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
    private boolean tinhTrang;

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang){
        super(maSach,ngayNhap,donGia,soLuong,nhaXuatBan);
    }

    public boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    //Methods
    public double thanhTien(){
        if (tinhTrang){
            return getSoLuong()*getDonGia();
        }
        return getSoLuong()*getDonGia()*0.5;
    }
}
