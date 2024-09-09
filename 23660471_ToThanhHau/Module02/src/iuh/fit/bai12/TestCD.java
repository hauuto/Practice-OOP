/*
 * @ (#) TestCD.java       1.0      9/9/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai12;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/9/2024 7:18 PM
 */
public class TestCD {
        public static void main(String[] args) {
            CDList cdList = new CDList();
            cdList.CDlist(5); // Tạo danh sách CD với 5 phần tử

            // Tạo một số đối tượng CD và thêm vào danh sách
            CD cd1 = new CD(12, "Album 1",5, 100.0);
            CD cd2 = new CD(13, "Album 2",10, 150.0);
            CD cd3 = new CD(14, "Album 3",15, 200.0);

            cdList.addCD(cd1);
            cdList.addCD(cd2);
            cdList.addCD(cd3);

            // In ra danh sách CD
            System.out.println(cdList.toString());
        }
}
