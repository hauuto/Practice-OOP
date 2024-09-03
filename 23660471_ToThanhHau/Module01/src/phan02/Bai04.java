package phan02;


//Toan tu pre-increment & post-increment
public class Bai04 {
    public static void main(String[] args){
        int i = 20;
        System.out.println(i);
        System.out.println();

        ++i;
        System.out.println(i);
        System.out.println(++i); // Tang gia tri i len 1 va tra ve gia tri moi (i+1, vi du: i = 20, ++i tra ve 21)

        System.out.println();

        System.out.println(i++); // Tang gia tri i len 1 nhung tra ve gia tri i (vi du i = 20, i++ tra ve 20)
        System.out.println(i); //Bien i sau khong gan phep cong cung tang len 1


        System.out.println();  //Tuong tu voi phep tru
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);
    }
}
