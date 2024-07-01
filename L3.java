import java.util.Scanner;
public class L3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, jurusan;
        System.out.println("==================================");
        System.out.println("   Menghitung Nilai Mahasiswa");
        System.out.println("==================================");
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();

        System.out.println("==================================");
        System.out.print("Nama\t\t: ");
        nama = input.nextLine();
        System.out.print("NIM\t\t: ");
        nim = input.nextLine();
        System.out.print("Jurusan\t\t: ");
        jurusan = input.nextLine();
        System.out.println("==================================");

        double totalNilai = 0;

        System.out.println();
        System.out.println("Input Nilai Mata Kuliah:");
        System.out.println("==================================");

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("Mata kuliah ke-" + i + ":");
            System.out.print("Nilai UTS\t: ");
            double nilaiUTS = input.nextDouble();
            System.out.print("Nilai UAS\t: ");
            double nilaiUAS = input.nextDouble();

            double nilaiAkhir = (nilaiUTS + nilaiUAS) / 2;
            totalNilai += nilaiAkhir;

            System.out.println();
        }
        double rataRata = totalNilai / jumlahMatkul;

        System.out.println("==================================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Jurusan\t\t: " + jurusan);
        System.out.println("==================================");
        System.out.println("Mata Kuliah\t\tNilai\t\tGrade");
        System.out.println("==================================");

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("Mata kuliah ke-" + i + "\t\t" + "nilai\t\tGrade");
        }
        System.out.println("==================================");
}
}
