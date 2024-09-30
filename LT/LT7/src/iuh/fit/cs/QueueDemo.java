/*
 * @ (#) QueueDemo.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 8:16 AM
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(126);
        queue.add(204);
        queue.add(234);
        queue.add(231);
        queue.add(523);
        queue.add(157);
        queue.add(331);
        queue.add(126);

        while(!queue.isEmpty()){
            Integer e = queue.poll();
            System.out.println(e);
        }
    }

}
