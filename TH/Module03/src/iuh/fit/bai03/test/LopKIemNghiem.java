package iuh.fit.bai03.test;
import iuh.fit.bai03.entity.*;
import java.time.LocalDate;
import iuh.fit.bai03.manager.*;

public class LopKIemNghiem {
    public static void main (String[] args){

        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        GiaoDich gd1 = new GiaoDichTienTe("GD001", LocalDate.of(2021, 10, 1), 100, 10, 23000, LoaiTienTe.USD);
        GiaoDich gd2 = new GiaoDichTienTe("GD002", LocalDate.of(2021, 10, 2), 200, 20, 24000, LoaiTienTe.Euro);
        GiaoDich gd3 = new GiaoDichVang("GD003", LocalDate.of(2021, 10, 3), 300, 30, "18k");
        GiaoDich gd4 = new GiaoDichVang("GD004", LocalDate.of(2021, 10, 4), 400, 40, "24k");

        danhSachGiaoDich.themGiaoDich(gd1);
        danhSachGiaoDich.themGiaoDich(gd2);
        danhSachGiaoDich.themGiaoDich(gd3);
        danhSachGiaoDich.themGiaoDich(gd4);

        System.out.println("Danh sach giao dich vang: ");
        System.out.printf("%10s %15s %15s %15s %15s %15s\n", "Ma GD", "Ngay GD", "Don gia", "So luong", "Loai vang", "Thanh tien");
        for (GiaoDich gd:danhSachGiaoDich.getDanhSachGiaoDichVang()){
            System.out.println(gd);
        }

        System.out.println("Danh sach giao dich tien te: ");
        System.out.printf("%10s %15s %15s %15s %15s %15s %15s\n", "Ma GD", "Ngay GD", "Don gia", "So luong", "Ti gia", "Loai tien", "Thanh tien");
        for (GiaoDich gd:danhSachGiaoDich.getDanhSachGiaoDichTienTe()){
            System.out.println(gd);
        }

        System.out.println("Tong so giao dich cac loai: ");
        danhSachGiaoDich.tongGiaoDichCacLoai();

        System.out.println("Trung binh thanh tien giao dich tien te: "+danhSachGiaoDich.trungBinhThanhTien());

        System.out.println("Danh sach giao dich co thanh tien hon 1 ty: ");
        danhSachGiaoDich.giaoDichCoThanhTienHon1Ty();


    }
}
