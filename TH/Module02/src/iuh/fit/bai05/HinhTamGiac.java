/*
 * @ (#) HinhTamGiac.java       1.0      9/30/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai05;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/30/2024 4:09 PM
 */
public class HinhTamGiac {
    private float ma;
    private float mb;
    private float mc;


    //Constructor
    public HinhTamGiac(){
        this(0, 0, 0);
    }

    public HinhTamGiac(float ma, float mb, float mc) {
        if (kiemTraTamGiac(ma,mb,mc)){
            setMa(ma);
            setMb(mb);
            setMc(mc);
        }else{
            setMa(0);
            setMb(0);
            setMc(0);
        }
    }


    //Getters and setters
    public float getMa() {
        return ma;
    }

    public void setMa(float ma) {
        if (ma<0){
            return;
        }
        this.ma = ma;
    }

    public float getMb() {
        return mb;
    }

    public void setMb(float mb) {
        if (mb<0){
            return;
        }
        this.mb = mb;
    }

    public float getMc() {
        return mc;
    }

    public void setMc(float mc) {
        if (mc<0){
            return;
        }
        this.mc = mc;
    }

    //Methods

    //Kiem tra 3 canh co lap duoc tam giac hay khong
    public boolean kiemTraTamGiac(float ma, float mb, float mc){
        if (ma + mb > mc && ma + mc > mb && mb + mc > ma){
            return true;
        }
        return false;
    }

    //Tinh chu vi tam giac
    public float tinhChuVi(){
        return ma + mb + mc;
    }

    //Tinh dien tich tam giac
    public float tinhDienTich(){
        float p = tinhChuVi()/2;
        return (float) Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }

    //Kiem tra kieu tam giac
    public String kieuTamGiac(){
        if (ma == 0 || mb == 0 || mc == 0){
            return "Khong phai tam giac";
        }else if (ma == mb && mb == mc){
            return "Tam giac deu";
        }else if (ma == mb || ma == mc || mb == mc){
            return "Tam giac can";
        }else if (ma*ma + mb*mb == mc*mc || ma*ma + mc*mc == mb*mb || mb*mb + mc*mc == ma*ma){
            return "Tam giac vuong";
        }else{
            return "Tam giac thuong";
        }
    }


    @Override
    public String toString(){
        return String.format("%.2f %.2f %.2f %-15s %.2f %.2f",ma,mb,mc,kieuTamGiac(),tinhChuVi(),tinhDienTich());
    }

}
