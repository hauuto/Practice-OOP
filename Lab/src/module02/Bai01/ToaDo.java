package module02.Bai01;

public class ToaDo {


    //Attributes
    private double x;
    private double y;
    private String name;



    //Constructors

    public ToaDo(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public ToaDo(){
        this(0,0,"");
    }


    //Getters and setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getThongTin(){
        return String.format("%s(%.2f,%.2f)",this.name,this.x,this.y);
    }
}
