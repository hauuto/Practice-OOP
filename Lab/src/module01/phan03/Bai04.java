package module01.phan03;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a:");
        double a = sc.nextDouble();
        System.out.println("Nhap b:");
        double b = sc.nextDouble();

        System.out.printf("Phuong trinh %.2fx + (%.2f) = 0\n",a,b);
        System.out.println("x = "+ (-b/a));
    }
}
