package app;


public class Main {
    public static void main(String[] args) {
        perpustakaan.Buku b1 = new perpustakaan.NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        perpustakaan.Buku b2 = new perpustakaan.Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        b1.displayInfo();
        b2.displayInfo();

        System.out.println();

        perpustakaan.Anggota a1 = new perpustakaan.Anggota("Rifqi Hakim", "280");
        perpustakaan.Anggota a2 = new perpustakaan.Anggota("Bayu Andrea", "283");


        a1.displayInfo();
        a2.displayInfo();

        System.out.println();

        a1.pinjamBuku("Madilog");
        a2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        System.out.println();

        a1.kembalikanBuku("Madilog");
        a2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
