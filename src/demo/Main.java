package demo;

public class Main {
    public static void main(String[] args) {
//        int soCanKT;
//        boolean ketQua;
//        ketQua = true;
//        for (int i = 2; i <soCanKT/2 ; i++) {
//            if (soCanKT % i ==0){
//                ketQua = false;
//            }
//        }
//        System.out.println(ketQua);
//    }
        SNT sNT = new SNT();
        sNT.soCanKT = 3;
        sNT.kiemTra();
        SNT sNT2 = new SNT();
        sNT2.soCanKT = 10;
        sNT2.kiemTra();
    }
}
