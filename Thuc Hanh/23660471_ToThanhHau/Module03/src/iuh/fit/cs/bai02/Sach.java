package iuh.fit.cs.bai02;

import java.time.LocalDate;

public abstract class Sach {
    private String maSach;
    private LocalDate ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        setMaSach(maSach);
        setNgayNhap(ngayNhap);
        setDonGia(donGia);
        setSoLuong(soLuong);
        setNhaXuatBan(nhaXuatBan);
    }
    public Sach(){
        setMaSach("");
        setNgayNhap(LocalDate.now());
        setDonGia(0.0d);
        setSoLuong(0);
        setNhaXuatBan("");
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
}
