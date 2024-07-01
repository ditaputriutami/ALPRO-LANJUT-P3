import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String nama, nim, jurusan;
        String Algoritma, PBO;
        int jumlahMatkul;
        String[] namaMatkul;
        int[] nilaiUts, nilaiUas, nilaiAkhir;
        char[] grade;

        // Input biodata
        System.out.println("==================================");
        System.out.println("Menghitung Nilai Mahasiswa      ");
        System.out.println("==================================");
         // Input jumlah mata kuliah
		System.out.print("Masukan Jumlah Mata Kuliah: ");
        jumlahMatkul = input.nextInt();
        System.out.println("==================================");

        System.out.print("Masukan Nama \t\t: ");
        nama = input.next();
        System.out.print("Masukan NIM \t\t: ");
        nim = input.next();
        System.out.print("Masukan Jurusan \t: ");
        jurusan = input.next();

        // Inisialisasi array
        namaMatkul = new String[jumlahMatkul];
        nilaiUts = new int[jumlahMatkul];
        nilaiUas = new int[jumlahMatkul];
        nilaiAkhir = new int[jumlahMatkul];
        grade = new char[jumlahMatkul];

        // Input data mata kuliah
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("==================================");
            System.out.println("Mata Kuliah ke-" + (i + 1) + " : Algoritma, PBO");
            System.out.print("Nilai UTS \t: ");
            nilaiUts[i] = input.nextInt();
            System.out.print("Nilai UAS \t: ");
            nilaiUas[i] = input.nextInt();

            // Menghitung nilai akhir dan grade
            nilaiAkhir[i] = (nilaiUts[i] + nilaiUas[i]) / 2;
            if (nilaiAkhir[i] >= 80) {
                grade[i] = 'A';
            } else if (nilaiAkhir[i] >= 70) {
                grade[i] = 'B';
            } else if (nilaiAkhir[i] >= 60) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        // Menampilkan output
        System.out.println("==================================");
        System.out.println(" Nama : " + nama + "      NPM : " + nim);
        System.out.println("==================================");
        System.out.println(" Mata Kuliah     Nilai       Grade");
        System.out.println("==================================");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-20s %8d %8c\n", namaMatkul[i], nilaiAkhir[i], grade[i]);
        }
        System.out.println("==================================");
        input.nextLine();
}
}