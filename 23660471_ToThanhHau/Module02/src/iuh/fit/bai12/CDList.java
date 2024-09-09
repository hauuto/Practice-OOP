/*
 * @ (#) CDList.java       1.0      9/9/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai12;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/9/2024 7:03 PM
 */
public class CDList {
    private int count = 0;
    private CD[] listCD;



    //Methods
    //Create a list of CD with n elements
    public void CDlist(int n){
        if (n<=0){
            throw new IllegalArgumentException("Số lượng CD phải lớn hơn 0");
        }
        listCD = new CD[n];
    }

    public void addCD(CD cd){
        if (cd == null){
            throw new NullPointerException("CD không được null");
        }
        if (count == listCD.length){
            throw new IllegalArgumentException("Danh sách CD đã đầy");
        }
        listCD[count++] = cd;
    }


    @Override
    public String toString(){
        
    }
}
