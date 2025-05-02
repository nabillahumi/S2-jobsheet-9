public class Surat18 {
    
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' untuk sakit, 'I' untuk izin keperluan
    int durasi;

    public Surat18(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
