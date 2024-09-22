package iuh.fit.cs.bai01;

public class TestChuyenXe {

    public static void main(String[] args) {
        XeNoiThanh xe1 = new XeNoiThanh("MS1","hauuto","13",10,23.5,1000);
        XeNoiThanh xe2 = new XeNoiThanh("MS2","hauuto","11",1,12.5,1000);
        XeNgoaiThanh xe3 = new XeNgoaiThanh("MS3","nguyen van a","2","Ha Noi",100,2000);
        XeNgoaiThanh xe4 = new XeNgoaiThanh("MS4","Nguyen tran b","235sa","Dong Thap",23,10000);


        System.out.println("Tong doanh thu: " + (xe1.getDoanhThu()+ xe2.getDoanhThu()+ xe3.getDoanhThu()+ xe4.getDoanhThu()));
        System.out.println("Xe noi thanh doanh thu: " + (xe1.getDoanhThu()+ xe2.getDoanhThu()));
        System.out.println("Xe ngoai thanh doanh thu: " + (xe3.getDoanhThu()+ xe4.getDoanhThu()));
    }
}
