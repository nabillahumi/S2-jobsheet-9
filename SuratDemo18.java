import java.util.Scanner;

public class SuratDemo18 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Berdasarkan Nama");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat18 surat = new Surat18(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat18 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat milik " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat18 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir milik: " + terakhir.namaMahasiswa);
                        System.out.println("ID: " + terakhir.idSurat + ", Jenis: " + terakhir.jenisIzin + ", Durasi: " + terakhir.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan untuk: " + cariNama);
                    } else {
                        System.out.println("Tidak ada surat dari: " + cariNama);
                    }
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}
