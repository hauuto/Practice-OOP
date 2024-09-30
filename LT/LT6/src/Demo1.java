/*
 * @ (#) Demo1.java       1.0      9/17/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/17/2024 7:21 AM
 */
public class Demo1 {
    public static void main (String[] args){

        try{
            int arr[] = {34,23,54};
            int a= 10, b=3;
            double c = 10;

            System.out.println(arr[0]);
            System.out.println(arr[3]);  //ArrayIndexOutOfBoundsException (index out of range)
            System.out.println(a/b); ///by zero, ArithmeticException
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index of array is from 0 to length-1");
        }catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception e){
            System.out.println("Some Error");
        }finally{
            System.out.println("Bye");
        }
    }
}
