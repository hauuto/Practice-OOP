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

    //Getter
    public int getCount() {
        return count;
    }

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
        for (int i=0; i<count; i++){
            if (listCD[i].getMaCD() == cd.getMaCD()){
                throw new IllegalArgumentException("CD đã tồn tại");
            }
        }
        listCD[count++] = cd;
    }

    public double sumPrice(){
        double sum = 0;
        for (int i=0; i<count; i++){
            sum += listCD[i].getGiaThanh();
        }
        return sum;
    }

    public boolean removeCD(CD cdRemove) {
        if (cdRemove == null){
            throw new NullPointerException("CD không được null");
        }
        for (int i=0; i<count; i++){
            if (listCD[i].getMaCD() == cdRemove.getMaCD()){
                for (int j=i; j<count-1; j++){
                    listCD[j] = listCD[j+1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    public CD findCD(int maCD){
        for (int i=0; i<count; i++){
            if (listCD[i].getMaCD() == maCD){
                return listCD[i];
            }
        }
        return null;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i=0; i<count; i++){
            result += listCD[i].toString() + "\n";

        }
        return result;
    }


    public void sortByPrice() {
        for (int i=0; i<count-1; i++){
            for (int j=i+1; j<count; j++){
                if (listCD[i].getGiaThanh() < listCD[j].getGiaThanh()){
                    CD temp = listCD[i];
                    listCD[i] = listCD[j];
                    listCD[j] = temp;
                }
            }
        }
    }

    public void sortByTitle() {
        for (int i=0; i<count-1; i++){
            for (int j=i+1; j<count; j++){
                if (listCD[i].getTuaCD().compareTo(listCD[j].getTuaCD()) > 0){
                    CD temp = listCD[i];
                    listCD[i] = listCD[j];
                    listCD[j] = temp;
                }
            }
        }
    }
}
