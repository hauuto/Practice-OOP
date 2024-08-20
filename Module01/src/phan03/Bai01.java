package phan03;

//If else, switch case
public class Bai01 {

    public static void Hocluc(double DiemTrungBinh){
        if ((DiemTrungBinh <0) || (DiemTrungBinh >10)){
            System.out.println("Diem khong hop le");
            return;
        }
        if (DiemTrungBinh >= 8.0){
            System.out.println("Gioi");
        }else if (DiemTrungBinh >= 6.5) {
            System.out.println("Kha");
        }else if (DiemTrungBinh >= 5) {
            System.out.println("Trung Binh");
        }else if (DiemTrungBinh >= 3.5) {
            System.out.println("Yeu");
        }else {
            System.out.println("Kem");
        }
    }

    public static void week_day(int day){
        switch (day){


        }

    }


    public static void main(String[] args){
        double Diem = 20;
        Hocluc(Diem);
    }
}
