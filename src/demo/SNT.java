package demo;

class SNT {
    int soCanKT;
    boolean ketQua;

    void kiemTra(){
        ketQua = true;
        for (int i = 2; i <soCanKT/2 ; i++) {
            if (soCanKT % i ==0){
                ketQua = false;
            }
        }
        System.out.println(ketQua);
    }

}
