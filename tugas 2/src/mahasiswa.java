public class mahasiswa {
    private String nama = "Rifqi hakim asmenta";
    private String nim = "202410370110280";

    public boolean login(String inputNama, String inputNim) {
        return nama.equalsIgnoreCase(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
