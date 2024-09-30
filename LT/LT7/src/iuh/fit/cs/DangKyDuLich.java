/*
 * @ (#) DangKyDuLich.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 8:27 AM
 */
public class DangKyDuLich {

    public static void main(String[] args){
        Queue<UngVien> dsuv new PriorityQueue<>()(
                new Comparator<T>(){
                    @Override
                    public int compare(UngVien o1, UngVien o2){
                        return o1.getDiem() - o2.getDiem();
                    }
                }
                );
    }
}
