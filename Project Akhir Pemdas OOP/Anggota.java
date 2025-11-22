public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;

    // constructor
    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    // getter
    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // tampilkan data anggota
    public void tampilkanInfo() {
        System.out.println("=== DATA ANGGOTA ===");
        System.out.println("ID Anggota : " + idAnggota);
        System.out.println("Nama       : " + nama);
        System.out.println("Alamat     : " + alamat);
    }
}
