import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan data Anggota DPR
        ArrayList<Dpr> list = new ArrayList<>();

        // Scanner untuk input
        Scanner sc = new Scanner(System.in);

        // Deklarasi atribut
        String id;
        String name;
        String bidang;
        String partai;

        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|  Selamat Datang di Aplikasi Data Anggota DPR   |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|                PILIHAN MENU                    |");
        System.out.println("| (1) Tambah Anggota DPR                         |");
        System.out.println("| (2) Edit Anggota DPR                           |");
        System.out.println("| (3) Hapus Anggota DPR                          |");
        System.out.println("| (4) Tampilkan Data Anggota DPR                 |");
        System.out.println("| (5) Keluar                                     |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");

        int fitur = 0;

        do {
            int tanda = 0;
            System.out.println("Tekan angka yang dipilih (1 sampai 5): ");

            fitur = sc.nextInt();

            switch (fitur) {
                case 1:
                    // Tambah Anggota DPR
                    System.out.print("Masukkan ID         : ");
                    id = sc.next();
                    System.out.print("Masukkan Nama       : ");
                    name = sc.next();
                    System.out.print("Masukkan Bidang     : ");
                    bidang = sc.next();
                    System.out.print("Masukkan Partai     : ");
                    partai = sc.next();

                    // Tambahkan data ke ArrayList
                    list.add(new Dpr(id, name, bidang, partai));
                    System.out.println("Anggota DPR berhasil ditambahkan.");
                    break;

                case 2:
                    // Edit Anggota DPR
                    System.out.print("Masukkan ID Anggota DPR yang ingin di edit: ");
                    id = sc.next();

                    // Mengecek apakah ID yang diinputkan sudah ada
                    for (Dpr anggota : list) {
                        if (anggota.getId().equals(id)) {
                            // Jika ada ID yang sama, lakukan pengeditan
                            System.out.print("Masukkan Nama baru       : ");
                            name = sc.next();
                            System.out.print("Masukkan Bidang baru     : ");
                            bidang = sc.next();
                            System.out.print("Masukkan Partai baru     : ");
                            partai = sc.next();

                            // Timpa nilai sebelumnya
                            anggota.setName(name);
                            anggota.setBidang(bidang);
                            anggota.setPartai(partai);
                            System.out.println("Data Berhasil diedit.");
                            tanda = 1;
                            break;
                        }
                    }

                    // Error handling jika ID tidak ditemukan
                    if (tanda == 0) {
                        System.out.println("ID tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Hapus Anggota DPR
                    System.out.print("Masukkan ID Anggota DPR yang ingin dihapus: ");
                    id = sc.next();

                    // Mengecek apakah ID yang diinputkan sudah ada
                    Iterator<Dpr> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Dpr anggota = iterator.next();
                        if (anggota.getId().equals(id)) {
                            iterator.remove(); // Menghapus elemen yang sesuai kondisi
                            tanda = 1;
                            break;
                        }
                    }

                    // Jika ID tidak ditemukan
                    if (tanda == 0) {
                        System.out.println("ID tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Tampilkan Data Anggota DPR
                    if (list.isEmpty()) {
                        System.out.println("Data Anggota DPR Kosong.");
                    } else {
                        // Menentukan lebar kolom secara dinamis
                        int[] lebarKolom = new int[4];

                        for (Dpr anggota : list) {
                            lebarKolom[0] = Math.max(lebarKolom[0], anggota.getId().length());
                            lebarKolom[1] = Math.max(lebarKolom[1], anggota.getName().length());
                            lebarKolom[2] = Math.max(lebarKolom[2], anggota.getBidang().length());
                            lebarKolom[3] = Math.max(lebarKolom[3], anggota.getPartai().length());
                        }

                        // Menampilkan header tabel
                        System.out.println("| " + centerAlign("ID", lebarKolom[0]) + " | " +
                                centerAlign("Nama", lebarKolom[1]) + " | " +
                                centerAlign("Bidang", lebarKolom[2]) + " | " +
                                centerAlign("Partai", lebarKolom[3]) + " |");

                        // Menampilkan garis pembatas tabel
                        System.out.println("|" + repeatString("-", lebarKolom[0] + 2) + "|" +
                                repeatString("-", lebarKolom[1] + 2) + "|" +
                                repeatString("-", lebarKolom[2] + 2) + "|" +
                                repeatString("-", lebarKolom[3] + 2) + "|");

                        // Menampilkan data
                        for (Dpr anggota : list) {
                            System.out.println("| " + centerAlign(anggota.getId(), lebarKolom[0]) + " | " +
                                    centerAlign(anggota.getName(), lebarKolom[1]) + " | " +
                                    centerAlign(anggota.getBidang(), lebarKolom[2]) + " | " +
                                    centerAlign(anggota.getPartai(), lebarKolom[3]) + " |");
                        }
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;

                default:
                    // Error handling untuk pilihan yang tidak valid
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1 sampai 5.");
            }

            // Memulai ulang program
            System.out.println("");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|                PILIHAN MENU                    |");
            System.out.println("| (1) Tambah Anggota DPR                         |");
            System.out.println("| (2) Edit Anggota DPR                           |");
            System.out.println("| (3) Hapus Anggota DPR                          |");
            System.out.println("| (4) Tampilkan Data Anggota DPR                 |");
            System.out.println("| (5) Keluar                                     |");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("");
        } while (fitur != 5);

        // Menutup scanner
        sc.close();
    }

    // Fungsi untuk mengulang karakter sebanyak n kali
    private static String repeatString(String str, int n) {
        return n > 0 ? new String(new char[n]).replace("\0", str) : "";
    }

    // Fungsi untuk menengahkan teks dalam kolom tabel
    private static String centerAlign(String text, int width) {
        int padding = Math.max(0, width - text.length());
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;
        return repeatString(" ", leftPadding) + text + repeatString(" ", rightPadding);
    }
}
