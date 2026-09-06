public class Buku {

    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    // Relasi Buku dengan GenreBuku
    private GenreBuku genre;

    // Constructor
    public Buku(String idBuku, String judul, String penulis,
                int tahunTerbit, GenreBuku genre) {

        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.tersedia = true;
    }

    // Getter
    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public GenreBuku getGenre() {
        return genre;
    }

    // Method untuk meminjam buku
    public void pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Buku \"" + judul + "\" sedang dipinjam.");
        }
    }

    // Method untuk mengembalikan buku
    public void kembalikanBuku() {
        tersedia = true;
        System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
    }

    // Menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("ID Buku      : " + idBuku);
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Genre        : " + genre.getNamaGenre());
        System.out.println("Status       : " +
                (tersedia ? "Tersedia" : "Sedang Dipinjam"));
    }
}