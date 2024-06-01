package sistemnilai;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Kelas> daftarKelas = new ArrayList<>();
        Kelas kelasA = new Kelas("Kelas A");
        kelasA.tambahMahasiswa(new Mahasiswa("12345", "Alga", 85));
        kelasA.tambahMahasiswa(new Mahasiswa("23456", "Beni", 78));
        kelasA.tambahMahasiswa(new Mahasiswa("34567", "Charlie", 90));
        kelasA.tambahMahasiswa(new Mahasiswa("45678", "David", 92));
        daftarKelas.add(kelasA);

        kelasA.tampilkanMahasiswa();

        Kelas kelasB = new Kelas("Kelas B");
        kelasB.tambahMahasiswa(new Mahasiswa("56789", "Eve", 85));
        kelasB.tambahMahasiswa(new Mahasiswa("67890", "Frizz", 79));
        kelasB.tambahMahasiswa(new Mahasiswa("78901", "Juan", 88));
        daftarKelas.add(kelasB);

        Kelas kelasC = new Kelas("Kelas C");
        kelasC.tambahMahasiswa(new Mahasiswa("54321", "Gia", 90));
        kelasC.tambahMahasiswa(new Mahasiswa("65432", "Meydi", 77));
        kelasC.tambahMahasiswa(new Mahasiswa("76543", "Leopard", 84));
        daftarKelas.add(kelasC);


        displayRataRataSemuaKelas(daftarKelas);
    }

    public static void displayRataRataSemuaKelas(ArrayList<Kelas> daftarKelas)
    {
        int totalMahasiswa = 0;
        double totalRataRata = 0;

        for (Kelas kelas : daftarKelas)
        {
            double rataRataKelas = kelas.hitungRataRata();
            totalMahasiswa += kelas.getJumlahMahasiswa();
            totalRataRata += rataRataKelas;
            System.out.printf("Rata-rata nilai %s: %.2f%n", kelas.getNamaKelas(), rataRataKelas);
        }

        double rataRataSemuaKelas = totalRataRata / daftarKelas.size();
        System.out.printf("Rata-rata nilai dari seluruh kelas: %.2f%n", rataRataSemuaKelas);
        System.out.println("Jumlah mahasiswa dari seluruh kelas: " + totalMahasiswa);
    }
}
