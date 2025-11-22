import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input data buku
        System.out.println("== INPUT DATA BUKU ==");
        System.out.print("Kode Buku: ");
        String kodeBuku = sc.nextLine();

        System.out.print("Judul Buku: ");
        String judulBuku = sc.nextLine();

        System.out.print("Penulis: ");
        String penulis = sc.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahunTerbit = Integer.parseInt(sc.nextLine());

        Buku buku = new Buku(kodeBuku, judulBuku, penulis, tahunTerbit);

        //input data anggota
        System.out.println("\n== INPUT DATA ANGGOTA ==");
        System.out.print("ID Anggota: ");
        String idAnggota = sc.nextLine();

        System.out.print("Nama Anggota: ");
        String namaAnggota = sc.nextLine();

        System.out.print("Alamat: ");
        String alamat = sc.nextLine();

        Anggota anggota = new Anggota(idAnggota, namaAnggota, alamat);

        //input data petugas
        System.out.println("\n== INPUT DATA PETUGAS ==");
        System.out.print("ID Petugas: ");
        String idPetugas = sc.nextLine();

        System.out.print("Nama Petugas: ");
        String namaPetugas = sc.nextLine();

        System.out.print("Shift: ");
        String shift = sc.nextLine();

        Petugas petugas = new Petugas(idPetugas, namaPetugas, shift);

        // menu
        int pilihan;

        do {
            System.out.println("\n===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Tampilkan Data Buku");
            System.out.println("4. Tampilkan Data Anggota");
            System.out.println("5. Tampilkan Data Petugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== PROSES PEMINJAMAN ===");
                    // Proses pinjam buku
                    buku.pinjamBuku();
                    break;

                case 2:
                    System.out.println("\n=== PROSES PENGEMBALIAN ===");
                    // Proses kembalikan buku
                    buku.kembalikanBuku();
                    break;

                case 3:
                    System.out.println("\n===== DATA BUKU =====");
                    buku.tampilkanInfo();
                    break;

                case 4:
                    System.out.println("\n===== DATA ANGGOTA =====");
                    anggota.tampilkanInfo();
                    break;

                case 5:
                    System.out.println("\n===== DATA PETUGAS =====");
                    petugas.tampilkanInfo();
                    break;

                case 0:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}