/*
 * @ (#) ListDemo.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 7:49 AM
 */
public class ListDemo {
    public static void main(String[] args) {

        //Colection list with object data type
        List list = new ArrayList();

        List <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(42);
        list1.add(52);
        list1.add(61);


        for (int i =0; i<list1.size(); i++){
            Integer temp = list1.get(i);
            System.out.println(temp);
        }

        System.out.println();


        list1.remove(1);
        boolean result = list1.removeIf(e -> e % 2 == 0);
        System.out.println(result);

        Collections.sort(list1);






        for (Integer u : list1){
            System.out.println(u);
        }


    }
}
