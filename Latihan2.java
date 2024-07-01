import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahMatkul;
        String nama, nim, jurusan;
        String[] namaMatkul;
        int[] nilaiUts, nilaiUas;
        double[] nilaiAkhir;
        String[] grade;

        // Memasukkan jumlah mata kuliah
        System.out.print("Masukan Jumlah Mata Kuliah: ");
        jumlahMatkul = input.nextInt();

        // Deklarasi array
        namaMatkul = new String[jumlahMatkul];
        nilaiUts = new int[jumlahMatkul];
        nilaiUas = new int[jumlahMatkul];
        nilaiAkhir = new double[jumlahMatkul];
        grade = new String[jumlahMatkul];

        // Memasukkan data mahasiswa
        System.out.println("================================================");
        System.out.println("  Menghitung Nilai Mahasiswa");
        System.out.println("================================================");
        System.out.print("Nama             : ");
        nama = input.next();
        System.out.print("NIM              : ");
        nim = input.next();
        System.out.print("Jurusan          : ");
        jurusan = input.next();

        // Memasukkan data mata kuliah dan nilai
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("================================================");
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            namaMatkul[i] = input.next();
            System.out.print("Nilai UTS        : ");
            nilaiUts[i] = input.nextInt();
            System.out.print("Nilai UAS        : ");
            nilaiUas[i] = input.nextInt();
        }

        // Menghitung nilai akhir dan grade
        for (int i = 0; i < jumlahMatkul; i++) {
            nilaiAkhir[i] = (nilaiUts[i] + nilaiUas[i]) / 2;
            if (nilaiAkhir[i] >= 85) {
                grade[i] = "A";
            } else if (nilaiAkhir[i] >= 80) {
                grade[i] = "B";
            } else if (nilaiAkhir[i] >= 70) {
                grade[i] = "C";
            } else if (nilaiAkhir[i] >= 60) {
                grade[i] = "D";
            } else {
                grade[i] = "E";
            }
        }

        // Menampilkan hasil
        System.out.println("================================================");
        System.out.println("Nama : " + nama + "             NPM : " + nim);
        System.out.println("================================================");
        System.out.println("Mata Kuliah                    Nilai      Grade");
        System.out.println("================================================");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-25s      %4.1f         %s\n",namaMatkul[i],nilaiAkhir[i],grade[i]);
        }
    }
}
