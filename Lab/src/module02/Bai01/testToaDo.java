package module02.Bai01;

import java.util.Scanner;

public class testToaDo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToaDo toaDo = new ToaDo();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        toaDo.setName(name);
        System.out.println("Enter X: ");
        double x = sc.nextDouble();
        toaDo.setX(x);
        System.out.println("Enter Y: ");
        double y = sc.nextDouble();
        toaDo.setY(y);
        System.out.println(toaDo.getThongTin());
    }
}
