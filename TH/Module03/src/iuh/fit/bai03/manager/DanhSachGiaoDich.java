package iuh.fit.bai03.manager;
import iuh.fit.bai03.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachGiaoDich implements iGiaoDich{

    private List<GiaoDich> danhSachGiaoDich;

    public DanhSachGiaoDich(){
        danhSachGiaoDich = new ArrayList<>();
    }

    public List<GiaoDich> getDanhSachGiaoDich() {
        return danhSachGiaoDich;
    }

    public List<GiaoDich> getDanhSachGiaoDichVang(){
        return danhSachGiaoDich.stream().filter(gd -> gd instanceof GiaoDichVang).collect(Collectors.toList());
    }

    public List<GiaoDich> getDanhSachGiaoDichTienTe(){
        return danhSachGiaoDich.stream().filter(gd -> gd instanceof GiaoDichTienTe).collect(Collectors.toList());
    }


    @Override
    public boolean themGiaoDich(GiaoDich gd) {
        return danhSachGiaoDich.add(gd);
    }

    @Override
    public boolean xoaGiaoDich(GiaoDich gd) {
        return danhSachGiaoDich.remove(gd);
    }

    @Override
    public boolean suaGiaoDich(GiaoDich gd) {
        for (GiaoDich giaodich:danhSachGiaoDich){
            if (giaodich.getMaGiaoDich().equalsIgnoreCase(gd.getMaGiaoDich())){
                giaodich = gd;
                return true;
            }
        }
        return false;
    }

    @Override
    public GiaoDich timGiaoDich(String maGiaoDich) {
        for (GiaoDich giaodich:danhSachGiaoDich){
            if (giaodich.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)){
                return giaodich;
            }
        }
        return null;
    }

    @Override
    public void tongGiaoDichCacLoai() {
        int tongGiaoDichVang = 0;
        int tongGiaoDichTienTe = 0;
        for (GiaoDich gd:danhSachGiaoDich){
            if (gd instanceof GiaoDichVang){
                tongGiaoDichVang++;
            }else if (gd instanceof GiaoDichTienTe){
                tongGiaoDichTienTe++;
            }
        }
        System.out.println("Tong so giao dich vang: "+tongGiaoDichVang);
        System.out.println("Tong so giao dich tien te: "+tongGiaoDichTienTe);
    }

    @Override
    public double trungBinhThanhTien() {
        double tongThanhTien = 0;
        for (GiaoDich gd:danhSachGiaoDich){
            if (gd instanceof GiaoDichTienTe){
                tongThanhTien += gd.getThanhTien();
            }
        }
        return tongThanhTien;
    }

    @Override
    public void giaoDichCoThanhTienHon1Ty() {
        for (GiaoDich gd:danhSachGiaoDich){
            if (gd.getThanhTien()>1000000000){
                System.out.println(gd);
            }
        }
    }

}
