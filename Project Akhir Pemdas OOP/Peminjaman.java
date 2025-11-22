public class Peminjaman {
    private Buku buku;
    private String namaPeminjam;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(Buku buku, String namaPeminjam, String tanggalPinjam, String tanggalKembali) {
        this.buku = buku;
        this.namaPeminjam = namaPeminjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public void display() {
        System.out.println("=== Data Peminjaman ===");
        System.out.println("Judul Buku   : " + buku.getJudul());
        System.out.println("Peminjam     : " + namaPeminjam);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Tanggal Kembali : " + tanggalKembali);
    }
}