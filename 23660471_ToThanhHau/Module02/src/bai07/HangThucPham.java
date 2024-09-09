/*
 * @ (#) HangThucPham.java       1.0      9/4/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/4/2024 1:56 PM
 */
public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;


    //Constructors
    public HangThucPham(){
        this("xxx","xxx",1,LocalDate.now(),LocalDate.now());
    }

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan){
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }



    //Getters and Setters

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        if (maHang.trim() == "" || maHang == null){
            throw new IllegalArgumentException("Mã hàng không được trống!");
        }
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.trim() == "" || tenHang == null){
            tenHang = "xxx";
        }
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0){
            donGia = 0;
        }
        this.donGia = donGia;
    }

    public LocalDate getNgaySanXuat() {

        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isAfter(LocalDate.now())){
            ngaySanXuat = LocalDate.now();
        }
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isBefore(ngaySanXuat)) {
            ngayHetHan = ngaySanXuat;
        }
        this.ngayHetHan = ngayHetHan;
    }



    //Methods
    public boolean hetHan() {
        if (ngayHetHan.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }

    //Format LocalDate to dd/MM/YYYY
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String ngaySanXuatToString() {
        return ngaySanXuat.format(dtf);
    }
    public String ngayHetHanToString() {
        return ngayHetHan.format(dtf);
    }

    DecimalFormat df = new DecimalFormat("#,##0.00");

    @Override
    public String toString() {
        return String.format("%-10s %-10s %15s %15s %15s %15s",maHang,tenHang,df.format(donGia)+"VND",ngaySanXuatToString(),ngayHetHanToString(),hetHan()==true?"Hàng hết hạn":"");
    }
}
