package module02.Bai04;

public class DiemSinhVien {

    //Attributes

    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;


    //Constructor

        //Default constructor

    public DiemSinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public DiemSinhVien(int MaSV, String HoTen, float DiemLT, float DiemTH) {
        setMaSV(MaSV);
        setHoTen(HoTen);
        setDiemLT(DiemLT);
        setDiemTH(DiemTH);

    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if(diemTH>0.0 && diemTH<10.0){
            this.diemTH = diemTH;
        }
        throw new IllegalArgumentException("Diem thuc hanh phai nam giua 0.0 va 10.0");

    }

    public float getDiemLT() {
        return diemLT;
    }


    public void setDiemLT(float diemLT) {
            if(diemLT>0.0 && diemLT<10.0){
                this.diemLT = diemLT;
            }
            throw new IllegalArgumentException("Diem ly thuyet phai nam giua 0.0 va 10.0");
        }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if(hoTen.equals("")){
            throw new IllegalArgumentException("Ho ten khong duoc de trong");
        }
        if (hoTen == null){
            throw new IllegalArgumentException("Ho ten khong duoc null");

        }
        this.hoTen = hoTen;
    }

    public int getMaSV() {
        if (maSV<=0){
            throw new IllegalArgumentException("Ma sinh vien phai lon hon 0");
        }
        return maSV;
    }

    public void setMaSV(int maSV) {

        this.maSV = maSV;
    }



    //Methods
    public double diemTB(){
        return (diemLT+diemTH)/2;
    }



    @Override
    public String toString() {
        return String.format("%-15d%-30s%-15.1f%-15.1f%-15.2f", maSV, hoTen, diemLT, diemTH,diemTB());
    }
}
