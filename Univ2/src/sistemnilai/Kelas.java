package sistemnilai;

import java.util.ArrayList;

public class Kelas
{
    private String namaKelas;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private static int jumlahMahasiswa;
    
    public String getNamaKelas()
    {
        return namaKelas;
    }

    public int getJumlahMahasiswa()
    {
        return daftarMahasiswa.size();
    }
    
    public static int getTotalMahasiswa(ArrayList<Kelas> daftarKelas)
    {
        int totalMahasiswa = 0;
        for (Kelas kelas : daftarKelas)
        {
            totalMahasiswa += kelas.getJumlahMahasiswa();
        }
        return totalMahasiswa;
    }

    public Kelas(String namaKelas)
    {
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs)
    {
        daftarMahasiswa.add(mhs);
        jumlahMahasiswa++;
    }

    public void hapusMahasiswa(Mahasiswa mhs)
    {
        daftarMahasiswa.remove(mhs);
        jumlahMahasiswa--;
    }

    public double hitungRataRata()
    {
        if (daftarMahasiswa.isEmpty())
        {
            return 0;
        }

        int total = 0;
        for (Mahasiswa mhs : daftarMahasiswa)
        {
            total += mhs.getNilai();
        }

        return (double) total / daftarMahasiswa.size();
    }

    public void tampilkanMahasiswa() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nilai: " + mahasiswa.getNilai());
            System.out.println();
        }
    }
    
}
