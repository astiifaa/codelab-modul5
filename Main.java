import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa (input 'finish' untuk mengakhiri):");

        while (true) {
            String inputNama = scanner.nextLine();

            if (inputNama.equalsIgnoreCase("finish")) {
                break;
            }

            try {
                mahasiswa.tambahNama(inputNama);
                System.out.println("Nama " + inputNama + " ditambahkan ke dalam list.");
            } catch (IllegalArgumentException error) {
                System.out.println("Error: " + error.getMessage());
            }
        }

        mahasiswa.tampilkanDaftarNama();
    }
}