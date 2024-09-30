package iuh.fit.cs;


@FunctionalInterface
public interface MyInterface {

    int sum(int a, int b);

    default void printInfor(){
        System.out.println("Hello");
    }


    //Only inheritan, can't override
    static void printInfor2(){
        System.out.println("Hi");
    }
}

