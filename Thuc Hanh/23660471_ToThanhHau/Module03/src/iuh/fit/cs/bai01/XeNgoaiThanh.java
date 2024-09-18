package iuh.fit.cs.bai01;

public class XeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
    private int doanhThu;


    //Constructors
    public XeNgoaiThanh(String maSoChuyen, String hoTenTX, String soXe, String noiDen, int soNgayDiDuoc, int doanhThu) {
        super(maSoChuyen, hoTenTX, soXe);
        setNoiDen(noiDen);
        setSoNgayDiDuoc(soNgayDiDuoc);
        setDoanhThu(doanhThu);

    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}
