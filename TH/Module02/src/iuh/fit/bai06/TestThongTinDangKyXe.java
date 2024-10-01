/*
 * @ (#) TestThongTinDangKyXe.java       1.0      10/2/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai06;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 10/2/2024 1:56 AM
 */
public class TestThongTinDangKyXe {

    public static void main (String[] args){
        ThongTinDangKyXe xe[] = new ThongTinDangKyXe[4];
        xe[0] = new ThongTinDangKyXe("Nguyen Van A", "Xe may", 10000000, 100);
        xe[1] = new ThongTinDangKyXe("Nguyen Van B", "Xe may", 20000000, 150);
        xe[2] = new ThongTinDangKyXe("Nguyen Van C", "Xe hoi", 500000000, 2000);
        xe[3] = new ThongTinDangKyXe("Nguyen Van D", "Xe hoi", 1000000000, 5000);

        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Chu xe","Loai xe","Tri gia xe","Dung tich","Thue");
        System.out.println("=".repeat(100));
        for (ThongTinDangKyXe x : xe){
            System.out.println(x);
        }

    }
}
