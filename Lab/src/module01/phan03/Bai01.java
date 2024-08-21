package module01.phan03;

//If else, switch case
public class Bai01 {

    public static void Hocluc(double DiemTrungBinh){
        if ((DiemTrungBinh <0) || (DiemTrungBinh >10)){
            System.out.println("Diem khong hop le");
            return;
        }
        if (DiemTrungBinh>=9.0){
            System.out.println("Xuat sac");
        }else if (DiemTrungBinh >= 8.0){
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
        if ((day <2) || (day > 7)){
            System.out.println("Ngay khong hop le");
            return;
        }
        switch (day){
            case 2: System.out.println("Thu hai"); break;
            case 3: System.out.println("Thu ba"); break;
            case 4: System.out.println("Thu tu"); break;
            case 5: System.out.println("Thu nam"); break;
            case 6: System.out.println("Thu sau"); break;
            case 7: System.out.println("Thu bay"); break;
            case 8: System.out.println("Chu nhat"); break;


        }

    }


    public static void main(String[] args){
        double Diem = 10;
        int ngay = 2;
        Hocluc(Diem);
        week_day(ngay);
    }
}
