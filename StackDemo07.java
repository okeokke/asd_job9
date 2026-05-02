import java.util.Scanner;
public class StackDemo07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilih;
    StackSurat07 stackSurat = new StackSurat07(5);

    do {
    System.out.println("\nMenu:");
    System.out.println("1. Terima Surat Izin");
    System.out.println("2. Proses Surat Izin");
    System.out.println("3. Lihat Surat Izin Terakhir");
    System.out.println("4. Cari Surat");
    System.out.print("Pilih: ");
    pilih = sc.nextInt();
    sc.nextLine();
    switch (pilih) {
      case 1:
        System.out.print("ID Surat: ");
        String idSurat = sc.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String namaSurat = sc.nextLine();
        System.out.print("Kelas: ");
        String kelasSurat = sc.nextLine();
        System.out.print("Jenis Izin (S/I): ");
        char jenisIzin = sc.nextLine().charAt(0);
        System.out.print("Durasi (hari): ");
        int durasi = sc.nextInt();
        sc.nextLine();
        Surat07 surat = new Surat07(idSurat, namaSurat, kelasSurat, jenisIzin, durasi);
        stackSurat.push(surat);
        System.out.printf("Surat izin %s berhasil diterima\n", namaSurat);
        break;
      case 2:
        Surat07 prosesSurat = stackSurat.pop();
        if (prosesSurat != null) {
          System.out.println("Memproses surat izin dari " + prosesSurat.namaMahasiswa);
          System.out.println("ID Surat: " + prosesSurat.idSurat);
          System.out.println("Kelas: " + prosesSurat.kelas);
          System.out.println("Jenis Izin: " + prosesSurat.jenisIzin);
          System.out.println("Durasi: " + prosesSurat.durasi + " hari");
        }
        break;
      case 3:
        Surat07 lihatSurat = stackSurat.peek();
        if (lihatSurat != null) {
          System.out.println("Surat izin terakhir:");
          System.out.println("ID Surat: " + lihatSurat.idSurat);
          System.out.println("Nama: " + lihatSurat.namaMahasiswa);
          System.out.println("Kelas: " + lihatSurat.kelas);
          System.out.println("Jenis Izin: " + lihatSurat.jenisIzin);
          System.out.println("Durasi: " + lihatSurat.durasi + " hari");
        }
        break;
      case 4:
        System.out.print("Masukkan nama mahasiswa: ");
        String cariNama = sc.nextLine();
        Surat07 foundSurat = stackSurat.cariSurat(cariNama);
        if (foundSurat != null) {
          System.out.println("Surat izin ditemukan:");
          System.out.println("ID Surat: " + foundSurat.idSurat);
          System.out.println("Nama: " + foundSurat.namaMahasiswa);
          System.out.println("Kelas: " + foundSurat.kelas);
          System.out.println("Jenis Izin: " + foundSurat.jenisIzin);
          System.out.println("Durasi: " + foundSurat.durasi + " hari");
        } else {
          System.out.println("Surat izin untuk mahasiswa " + cariNama + " tidak ditemukan.");
        }
        break;
      default:
        System.out.println("Pilihan tidak valid.");
      }
    } while (pilih >= 1 && pilih <= 4);
    sc.close();
  }
}
