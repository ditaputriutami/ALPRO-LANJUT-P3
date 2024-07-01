import java.util.Scanner;
public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahMahasiswa;
        String[] nama, nim;
        int[][] nilaiTugas;
        double[] rataRata;

        // Memasukkan jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        // Deklarasi array
        nama = new String[jumlahMahasiswa];
        nim = new String[jumlahMahasiswa];
        nilaiTugas = new int[jumlahMahasiswa][3];
        rataRata = new double[jumlahMahasiswa];

        // Memasukkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("=============================");
            System.out.println("  Mahasiswa ke-" + (i + 1));
            System.out.print(" Nama    : ");
            nama[i] = input.next();
            System.out.print(" NIM     : ");
            nim[i] = input.next();
            for (int j = 0; j < 3; j++) {
                System.out.print(" Nilai Tugas " + (j + 1) + " : ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }
        // Menghitung rata-rata
        for (int i = 0; i < jumlahMahasiswa; i++) {
            rataRata[i] = (nilaiTugas[i][0] + nilaiTugas[i][1] + nilaiTugas[i][2]) / 3;
        }
        // Menampilkan hasil
        System.out.println("=============================");
        System.out.println("                               Daftar Nilai Mata Kuliah Algoritma");
        System.out.println("+-----------------+------------+------------+-----------+-----------+--------------+");
        System.out.printf("| %-15s | %-10s | %-10s | %-9s | %-9s | %-12s |\n", "Nama", "NIM", "Tugas 1", "Tugas 2", "Tugas 3", "Rata-rata");
        System.out.println("+-----------------+------------+------------+-----------+-----------+--------------+");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("| %-15s | %-10s | %10d | %9d | %9d | %12.2f |\n",
            nama[i], nim[i], nilaiTugas[i][0], nilaiTugas[i][1], nilaiTugas[i][2], rataRata[i]);
        }
        System.out.println("+-----------------+------------+------------+-----------+-----------+--------------+");
    }
}
