class Hewan {
    String Nama;
    String Jenis;
    String Suara;

    public void tampilkaninfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
    }
}

 public class Main {
    public static void main(String[] args) {
        Hewan hewani = new Hewan();
        hewani.Nama = "Kucing";
        hewani.Jenis = "Mamalia";
        hewani.Suara = "Nyann~~";

        Hewan hewan2 = new Hewan();
        hewan2.Nama = "Anjing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Woof-Woof!!";

        hewani.tampilkaninfo();
        System.out.println(); // Baris kosong untuk pemisah
        hewan2.tampilkaninfo();
    }
}