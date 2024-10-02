/*
 * @ (#) ThongTinDangKyXe.java       1.0      10/2/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai06;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 10/2/2024 1:43 AM
 */
public class ThongTinDangKyXe {
    private String chuXe;
    private String loaiXe;
    private float triGiaXe;
    private int dungTich;
    private float thue;


    //Constructors
    public ThongTinDangKyXe(){
        this("", "", 0, 0);
    }

    public ThongTinDangKyXe(String chuXe, String loaiXe, float triGiaXe, int dungTich){
        setChuXe(chuXe);
        setLoaiXe(loaiXe);
        setTriGiaXe(triGiaXe);
        setDungTich(dungTich);
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public float getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(float triGiaXe) {
        if (triGiaXe < 0){
            throw new IllegalArgumentException("Tri gia xe phai lon hon 0");
        }
        this.triGiaXe = triGiaXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        if (dungTich < 0){
            throw new IllegalArgumentException("Dung tich phai lon hon 0");
        }
        this.dungTich = dungTich;
    }

    public float getThue() {
        if (dungTich < 100){
            thue = triGiaXe * 0.01f;
        }else if (dungTich >= 100 && dungTich <= 200){
            thue = triGiaXe * 0.03f;
        }else {
            thue = triGiaXe * 0.05f;
        }
        return thue;
    }

    @Override
    public String toString(){
        return String.format("%-20s %-20s %-20d %-20.1f %-20.1f", chuXe, loaiXe, dungTich, triGiaXe,getThue());
    }

}
