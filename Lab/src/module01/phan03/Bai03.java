package module01.phan03;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so: ");
        int c = sc.nextInt();
        int i = 0;
        int result = 0;
        if (c%2!=0){
            i =1;
        }


        for (;i<=c;i+=2){
            result += i;
        }
        System.out.println("result: " +result);
    }

}
