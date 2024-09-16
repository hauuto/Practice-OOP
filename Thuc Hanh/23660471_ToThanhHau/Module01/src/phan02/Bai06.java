package phan02;

//Toan tu dieu kien
public class Bai06 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        boolean condition = a>b;

        int max =  condition ? a : b;
        //neu condition == true thi max = a, nguoc lai max = b

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("Max: "+max);
    }
}
