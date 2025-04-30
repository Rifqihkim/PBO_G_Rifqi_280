import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Admin admin = new Admin("Admin", "777", "admin", "1234");
        Mahasiswa mhs = new Mahasiswa("Rifqi hakim asmenta", "202410370110280");

        boolean running = true;

        while (running) {
            System.out.print("\nPilih login sebagai (Admin/Mahasiswa), atau ketik 'T' untuk keluar: ");
            String pilihan = scanner.nextLine().toLowerCase();

            boolean berhasil = false;

            switch (pilihan) {
                case "admin":
                    System.out.print("Masukkan Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = scanner.nextLine();
                    berhasil = admin.login(username, password);
                    if (berhasil) {
                        admin.displayInfo();
                    } else {
                        System.out.println("Login Admin gagal.");
                    }
                    break;

                case "mahasiswa":
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    berhasil = mhs.login(nama, nim);
                    if (berhasil) {
                        mhs.displayInfo();
                    } else {
                        System.out.println("Login Mahasiswa gagal.");
                    }
                    break;

                case "T":
                    System.out.println("Terima kasih! Program selesai.");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }
}
