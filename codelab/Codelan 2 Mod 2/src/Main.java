import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi awal rekening
        RekeningBank rekening1 = new RekeningBank("202310370311129", "Maharani", 500000);
        RekeningBank rekening2 = new RekeningBank("202310370311307", "Amelia", 1000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Input transaksi Maharani
        System.out.print("Masukkan jumlah setoran Maharani: Rp");
        double setoranMaharani = input.nextDouble();
        rekening1.setorUang(setoranMaharani);

        System.out.print("Masukkan jumlah penarikan Maharani: Rp");
        double penarikanMaharani = input.nextDouble();
        rekening1.tarikUang(penarikanMaharani);

        // Input transaksi Amelia
        System.out.print("Masukkan jumlah setoran Amelia: Rp");
        double setoranAmelia = input.nextDouble();
        rekening2.setorUang(setoranAmelia);

        System.out.print("Masukkan jumlah penarikan Amelia: Rp");
        double penarikanAmelia = input.nextDouble();
        rekening2.tarikUang(penarikanAmelia);

        // Opsi struk
        System.out.print("Cetak struk? (ya/tidak): ");
        String cetakStruk = input.next();

        if (cetakStruk.equalsIgnoreCase("ya")) {
            System.out.println(); // Baris kosong untuk pemisah
            rekening1.tampilkanInfo();
            rekening2.tampilkanInfo();
        }

        input.close();
    }
}