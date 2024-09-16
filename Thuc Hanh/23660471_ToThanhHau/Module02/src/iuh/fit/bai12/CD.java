/*
 * @ (#) CD.java       1.0      9/9/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai12;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/9/2024 6:36 PM
 */
public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;
    

    //Constructors
    public CD(){
        this(999999,"chưa xác định",1,1);
    }
    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh){
        setMaCD(maCD);
        setTuaCD(tuaCD);
        setSoBaiHat(soBaiHat);
        setGiaThanh(giaThanh);
    }

    //Getters and Setters

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD <0){
            maCD = 999999;
        }
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD.trim() == "" || tuaCD == null){
            tuaCD = "chưa xác định";
        }
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat < 0){
            throw new IllegalArgumentException("Số bài hát phải lớn hơn 0");
        }
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh < 0){
            throw new IllegalArgumentException("Giá thành phải lớn hơn 0");
        }
        this.giaThanh = giaThanh;
    }


    @Override
    public String toString(){
        return String.format("%-15d%-30s%15d%30.2f",maCD,tuaCD,soBaiHat,giaThanh);
    }
}
