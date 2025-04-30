package perpustakaan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Anggota implements perpustakaan.Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void displayInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }

    @Override
    public void pinjamBuku(String judul) {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        System.out.println("Waktu peminjaman: " + waktu.format(formatter));
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
        System.out.println("Waktu peminjaman: " + waktu.format(formatter));
    }

    @Override
    public void kembalikanBuku(String judul) {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
        System.out.println("Waktu pengembalian: " + waktu.format(formatter));
    }
}
