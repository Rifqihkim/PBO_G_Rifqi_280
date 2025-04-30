import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Memilih Jenis Login
        System.out.println("Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membuang newline setelah nextInt()

        // 2. Pilihan Tidak Valid
        if (pilihan != 1 && pilihan != 2) {
            System.out.println("Pilihan tidak valid.");
        } else {
            // 3. Login Admin
            if (pilihan == 1) {
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();

                // Ganti "006" dengan 3 digit NIM terakhir Anda
                String nimTerakhir = "069";
                String usernameValid = "Admin" + nimTerakhir;
                String passwordValid = "password" + nimTerakhir;

                if (username.equals(usernameValid) && password.equals(passwordValid)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            }
            // 4. Login Mahasiswa
            else if (pilihan == 2) {
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("NIM: ");
                String nim = input.nextLine();

                String namaValid = "Rifqi Hakim Asmenta"; // Ganti dengan nama Anda
                String nimValid = "2024103703110280"; // Ganti dengan NIM Anda

                if (nama.equals(namaValid) && nim.equals(nimValid)) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            }
        }

        input.close();
    }
}