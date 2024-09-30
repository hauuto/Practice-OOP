package module02.Bai04;

import java.util.Scanner;

public class TestDiemSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiemSinhVien sv1 = new DiemSinhVien(23660471,"To Thanh Hau",12.0f,10.0f);
        DiemSinhVien sv2 = new DiemSinhVien(23660473,"Thai Nguyen Tue Minh",10,9.5f);

        DiemSinhVien sv3 = new DiemSinhVien();
        /*
        System.out.println("Nhap ma sinh vien cua sinh vien 3: ");
        int maSinhVien3 = sc.nextInt();
        System.out.println("Nhap ten cua sinh vien 3: ");
        String tenSinhVien3 = sc.next();
        System.out.println("Nhap diem ly thuyet cua sinh vien 3:");
        sc.nextLine();
        float diemLT3 = sc.nextFloat();
        System.out.println("Nhap diem thuc hanh cua sinh vien 3:");
        float diemTH3 = sc.nextFloat();*/



        System.out.println(String.format("%-15s%-30s%-15s%-15s%-15s","MSSV","Ho ten","DiemLT","DiemTH","DiemTB"));
        System.out.println("------------------------------------------------------");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
