/*
 * @ (#) HangThucPham.java       1.0      9/4/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai07;

import java.time.LocalDate;
import java.util.Locale;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/4/2024 1:56 PM
 */
public class HangThucPham {
    private static String maHang;
    private static String tenHang;
    private static double donGia;
    private static LocalDate ngaySanXuat;
    private static LocalDate ngayHetHan;


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

    public static String getMaHang() {
        return maHang;
    }

    public static void setMaHang(String maHang) {
        if (maHang.trim() == "" || maHang == null){
            throw new IllegalArgumentException("Ma hang khong duoc de trong");
        }
        HangThucPham.maHang = maHang;
    }

    public static String getTenHang() {
        return tenHang;
    }

    public static void setTenHang(String tenHang) {
        if (tenHang.trim() == "" || tenHang == null){
            HangThucPham.tenHang = "xxx";
        }
        HangThucPham.tenHang = tenHang;
    }

    public static double getDonGia() {
        return donGia;
    }

    public static void setDonGia(double donGia) {
        if (donGia <= 0){
            HangThucPham.donGia = 0;
        }
        HangThucPham.donGia = donGia;
    }

    public static LocalDate getNgaySanXuat() {
    	
        return ngaySanXuat;
    }

    public static void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isAfter(LocalDate.now())){
            HangThucPham.ngaySanXuat = LocalDate.now();
        }
        HangThucPham.ngaySanXuat = ngaySanXuat;
    }

    public static LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public static void setNgayHetHan(LocalDate ngayHetHan) {
    	if (ngayHetHan.isBefore(ngaySanXuat)) {
    		HangThucPham.ngayHetHan = ngaySanXuat;
    	}
        HangThucPham.ngayHetHan = ngayHetHan;
    }
    
    
    
    //Methods
    public static boolean hetHan() {
    	if (ngayHetHan.isBefore(LocalDate.now())) {
    		return true;
    	}
    	return false;
    }
    
    
    @Override
    public static String toString() {
    	return String.format("%10s %10s %-.2f %15s %15s %",)
    }
}
