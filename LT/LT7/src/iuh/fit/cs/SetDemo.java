/*
 * @ (#) SetDemo.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 8:07 AM
 */
public class SetDemo {
    public static void main(String[] args){
//        Set<Integer> col = new HashSet<>();
//        Set<Integer> col = new LinkedHashSet<>();
        Set<Integer> col = new TreeSet<>();

        col.add(126);
        col.add(204);
        col.add(234);
        col.add(231);
        col.add(523);
        col.add(157);
        col.add(331);
        col.add(126);

        for (Integer i : col){
            System.out.println(i);
        }

        col.remove(126);
    }
}
