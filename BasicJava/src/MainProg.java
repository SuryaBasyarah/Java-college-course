public class MainProg {

    int[] angka;
    String[] pesan;

    public MainProg(int index) {
        angka = new int[index];
        pesan = new String[index];
    }

    public static void main(String[] args) {
        MainProg objek = new MainProg(5);
        MainProg[] objekKedua = new MainProg[3];

        objek.angka[0] = 0;
        objek.angka[1] = 1;

        objek.pesan[0] = "test1";
        objek.pesan[1] = "test2";

        System.out.println(objek.angka[0]);
        objekKedua[0] = objek;
        System.out.println(objekKedua[0].pesan[1]);
    }
}
