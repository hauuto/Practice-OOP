package iuh.fit.cs.bai01;

public class XeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKM;
    private double doanhThu;

    //Constructor
    public XeNoiThanh(String maSoChuyen, String hoTenTX, String soXe, int soTuyen, double soKM, double doanhThu){
        super(maSoChuyen, hoTenTX, soXe);
        setSoTuyen(soTuyen);
        setSoKM(soKM);
        setDoanhThu(doanhThu);


    }


    //Getters and setters
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKM() {
        return soKM;
    }

    public void setSoKM(double soKM) {
        this.soKM = soKM;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
