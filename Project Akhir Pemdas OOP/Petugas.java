public class Petugas {
    private String idPetugas;
    private String namaPetugas;
    private String shift;

    // constructor
    public Petugas(String idPetugas, String namaPetugas, String shift) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.shift = shift;
    }

    // getter
    public String getIdPetugas() {
        return idPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public String getShift() {
        return shift;
    }

    // tampilkan info petugas
    public void tampilkanInfo() {
        System.out.println("=== DATA PETUGAS ===");
        System.out.println("ID Petugas  : " + idPetugas);
        System.out.println("Nama        : " + namaPetugas);
        System.out.println("Shift       : " + shift);
        System.out.println();
    }
}
