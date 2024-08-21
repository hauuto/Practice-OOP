package module01.phan03;

import java.util.Scanner;

public class Bai05 {
    public static int UCLN(int a, int b){
        if (a*b == 0){
            return a+b;
        }
        if (a>b){
            return UCLN(b,a%b);
        }
        return UCLN(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        int result = UCLN(a,b);

        System.out.println(result);
    }
}
