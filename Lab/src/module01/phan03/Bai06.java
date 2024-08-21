package module01.phan03;

import java.util.Scanner;

public class Bai06 {
    public static int primary_check(int n){
        if ((n==1) || (n==0)){
            return 0;
        }
        if (n==2){
            return 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = primary_check(n);
        if (result == 0){
            System.out.printf("%d khong la so nguyen to",n);
        }else {
            System.out.printf("%d la so nguyen to",n);
        }


    }
}
