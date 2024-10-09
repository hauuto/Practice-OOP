package iuh.fit.bai03.manager;
import iuh.fit.bai03.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachGiaoDich implements iGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public DanhSachGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }



    //getters and setters
    public List<GiaoDich> getDanhSachGiaoDich() {
        return danhSachGiaoDich;
    }

    public List<GiaoDich> getDanhSachGiaoDichTheoLoai(String loaiGiaoDich) {
        return danhSachGiaoDich.stream()
                .filter(gd -> gd.getClass().getSimpleName().equalsIgnoreCase(loaiGiaoDich))
                .collect(Collectors.toList());
    }

    @Override
    public int soLuongGiaoDichTheoLoai(String loaiGiaoDich) {
        return (int) danhSachGiaoDich.stream()
                .filter(gd -> gd.getClass().getSimpleName().equalsIgnoreCase(loaiGiaoDich))
                .count();
    }
    public double trungBinhThanhTienTheoLoai(String loaiGiaoDich) {
        List<GiaoDich> ds = getDanhSachGiaoDichTheoLoai(loaiGiaoDich);
        if(ds.size() == 0)
            return 0;
        return ds.stream()
                .mapToDouble(loaiGiaoDich.equalsIgnoreCase("GiaoDichVang") ? GiaoDichVang::thanhTien : GiaoDichTienTe::thanhTien)
                .average()
                .getAsDouble();
    }
    public boolean themGiaoDich(GiaoDich gd) {
        if(gd == null)
            return false;

        if(danhSachGiaoDich.contains(gd))
            return false;

        danhSachGiaoDich.add(gd);
        return true;
    }
}
