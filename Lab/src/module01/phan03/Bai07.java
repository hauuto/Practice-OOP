package module01.phan03;

import java.util.Scanner;


public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai06 primary = new Bai06();

        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();


        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = primary.primary_check(i);
            if (a==1){
                result += i;
            }
        }
        System.out.printf("Tong cac so nguyen to < %d = %d\n",n,result);
    }
}
