package sistemnilai;

public class Mahasiswa
{
    private String nim;
    private String nama;
    private int nilai;

    public Mahasiswa(String nim, String nama, int nilai)
    {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public Mahasiswa(String nim, String nama)
    {
        this(nim, nama, 0);
    }

    public String getNim()
    {
        return nim;
    }

    public String getNama()
    {
        return nama;
    }

    public int getNilai()
    {
        return nilai;
    }
}