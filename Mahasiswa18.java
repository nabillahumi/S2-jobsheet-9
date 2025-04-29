public class Mahasiswa18 {

    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa18(String nama, String nim, String kelaas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai (int nilai) {
        this.nilai = nilai;
    }
}