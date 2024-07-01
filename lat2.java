import java.util.Scanner;
public class lat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("  Menghitung Nilai Mahasiswa    ");
        System.out.println("================================");
        System.out.print("  Masukkan Jumlah Mata Kuliah:  ");


        int jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.println("Mata kuliah ke-" + i + " :");
            System.out.println("================================");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jurusan: ");
            String jurusan = scanner.nextLine();
            System.out.print("Nilai UTS: ");
            double nilaiUTS = scanner.nextDouble();
            System.out.print("Nilai UAS: ");
            double nilaiUAS = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer

            double nilaiAkhir = (nilaiUTS + nilaiUAS) / 2;
            String grade = hitungGrade(nilaiAkhir);

            System.out.println("Nama : " + nama + " NIM : " + nim + " Mata Kuliah Nilai Grade " + nama + " " + String.format("%.1f", nilaiAkhir) + " " + grade);
        }

        System.out.println("Press any key to continue .");
        scanner.nextLine(); // Menunggu input sebelum keluar
    }

    private static String hitungGrade(double nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 55) {
            return "D";
        } else {
            return "E";
	}
}
}