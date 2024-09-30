package iuh.fit.cs.bai01;

public abstract class ChuyenXe {

    protected String maSoChuyen;
    protected String hoTenTX;
    protected String soXe;


    //Contructors

    public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe) {
        setMaSoChuyen(maSoChuyen);
        setHoTenTX(hoTenTX);
        setSoXe(soXe);
    }
     public ChuyenXe(){
        setMaSoChuyen("");
        setHoTenTX("");
        setSoXe("");
     }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
}
