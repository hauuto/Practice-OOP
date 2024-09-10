/*
 * @ (#) TestCD.java       1.0      9/9/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai12;

import java.util.Scanner;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/9/2024 7:18 PM
 */
public class TestCD {
        public static void main(String[] args) {
            CDList cdList = new CDList();
            cdList.CDlist(20); // Tạo danh sách CD với 5 phần tử




            // Tạo một số đối tượng CD và thêm vào danh sách
            CD cd1 = new CD(12, "Album 1",5, 100);
            CD cd2 = new CD(13, "Album 2",10, 150.0);
            CD cd3 = new CD(14, "Album 3",15, 200.0);

            cdList.addCD(cd1);
            cdList.addCD(cd2);
            cdList.addCD(cd3);

            Scanner sc = new Scanner(System.in);
            int choose;
            do{
                System.out.println("1. Thêm CD");
                System.out.println("2. Hiển thị danh sách CD");
                System.out.println("3. Xóa CD theo mã");
                System.out.println("4. Tìm kiếm CD theo mã");
                System.out.println("5. Sắp xếp CD theo giá thành giảm");
                System.out.println("6. Sắp xếp CD theo tựa CD tăng");
                System.out.println("0. Thoát");
                System.out.print("Nhập lựa chọn: ");
                choose = sc.nextInt();
                sc.nextLine();

                switch (choose){
                    case 1:
                        System.out.print("Nhập mã CD: ");
                        int maCD = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập tựa CD: ");
                        String tuaCD = sc.nextLine();
                        System.out.print("Nhập số bài hát: ");
                        int soBaiHat = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập giá thành: ");
                        double giaThanh = sc.nextDouble();
                        sc.nextLine();
                        CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
                        cdList.addCD(cd);
                        break;
                    case 2:
                        System.out.printf("%-15s%-30s%15s%30s","Mã CD","Tựa CD","Số bài hát","Giá thành\n");
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println(cdList);

                        System.out.println("Tổng số CD: " + cdList.getCount());
                        System.out.println("Tổng giá thành: " + cdList.sumPrice());
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Nhập mã CD cần xóa: ");
                        int maCDRemove = sc.nextInt();
                        sc.nextLine();
                        CD cdRemove = new CD();
                        cdRemove.setMaCD(maCDRemove);
                        if (cdList.removeCD(cdRemove)){
                            System.out.println("Xóa thành công");
                        }else{
                            System.out.println("Xóa thất bại");
                        }
                        break;
                    case 4:
                        System.out.print("Nhập mã CD cần tìm: ");
                        int maCDSearch = sc.nextInt();
                        sc.nextLine();
                        CD cdSearch = cdList.findCD(maCDSearch);
                        if (cdSearch != null){
                            System.out.println(cdSearch);
                        }else{
                            System.out.println("Không tìm thấy CD");
                        }
                        break;
                    case 5:
                        cdList.sortByPrice();
                        System.out.println("Sắp xếp thành công");

                        break;
                    case 6:
                        cdList.sortByTitle();
                        System.out.println("Sắp xếp thành công");
                        break;


                }
            }while(choose !=0);


        }
}
