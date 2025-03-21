class KarakterGame {
    private String nama; // Variabel untuk menyimpan nama karakter
    private int kesehatan; // Variabel untuk menyimpan jumlah kesehatan karakter

    // Konstruktor: Dipanggil saat objek KarakterGame dibuat
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama; // Mengatur nama karakter
        this.kesehatan = kesehatan; // Mengatur jumlah kesehatan karakter
    }

    // Metode untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    // Metode untuk mengatur nama karakter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mendapatkan jumlah kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Metode untuk mengatur jumlah kesehatan karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Metode untuk menyerang karakter lain (akan diubah di kelas turunan)
    public void serang(KarakterGame target) {
        // Method ini akan di-override oleh subclass
    }
}