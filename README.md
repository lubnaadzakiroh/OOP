public class Buku {
    // atribut / variabel instance
    private String kodeBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    //constructor
    public Buku(String kodeBuku, String judul, String penulis, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    // getter
    public String getKodeBuku() {
        return kodeBuku;
    }
    public String getJudul() {
        return judul;
    }
    public boolean isTersedia() {
        return tersedia;
    }

    //method pinjam buku
    public void pinjamBuku() {
        if (tersedia) {
            System.out.println("Buku " + judul + " berhasil dipinjam.");
            tersedia = false;
        } else {
            System.out.println("Buku " + judul + " sedang tidak tersedia.");
        }
    }

    //method kembalikan buku
    public void kembalikanBuku() {
        if (!tersedia) {
            System.out.println("Buku " + judul + " telah dikembalikan.");
            tersedia = true;
        } else {
            System.out.println("Buku " + judul + " belum dipinjam.");
        }
    }

    //method tampilan
    public void tampilkanInfo() {
        System.out.println("=== DATA BUKU===");
        System.out.println("Kode Buku       : " + kodeBuku);
        System.out.println("Judul           : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }


    
    
}
