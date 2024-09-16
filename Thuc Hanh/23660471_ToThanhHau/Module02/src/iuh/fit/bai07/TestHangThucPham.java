/*
 * @ (#) TestHangThucPham.java       1.0      9/9/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai07;
import java.time.LocalDate;
/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/9/2024 5:19 PM
 */
public class TestHangThucPham {
    public static void main(String[] args) {

        HangThucPham hangThucPham1 = new HangThucPham("001","Gạo",100000, LocalDate.of(2023,9,9),LocalDate.of(2024,9,9));
        HangThucPham hangThucPham2 = new HangThucPham("002","Mì",20000, LocalDate.of(2023,9,9),LocalDate.of(2024,8,9));
        HangThucPham hangThucPham3 = new HangThucPham("003","Đường",30000, LocalDate.of(2022,9,9),LocalDate.of(2020,9,9));


        System.out.printf("%-10s %-10s %15s %15s %15s %15s \n","Mã Hàng","Tên Hàng","Đơn Giá","Ngày Sản Xuất","Ngày Hết Hạn","Hạn Sử Dụng");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println(hangThucPham1);
        System.out.println(hangThucPham2);
        System.out.println(hangThucPham3);


    }
}
