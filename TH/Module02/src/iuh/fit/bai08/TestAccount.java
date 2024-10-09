/*
 * @ (#) TestAccount.java       1.0      10/8/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai08;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 10/8/2024 11:53 PM
 */
public class TestAccount {
    public static void main(String[] args){
        Account acc1 = new Account(72354,"Ted Murphy", 100000);
        Account acc2 = new Account(69713,"Jane Smith", 40000);
        Account acc3 = new Account(93757,"Edward Demsey", 700000);

        acc1.deposit(250000);
        acc2.deposit(500000);
        acc3.addInterest();

        System.out.printf("%-20s %-20s %-20s %-20s\n","Account Number","Name","Balance","Rate");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        acc2.tranfer(acc1, 100000);
        System.out.println(acc1);
        System.out.println(acc2);

    }

}
