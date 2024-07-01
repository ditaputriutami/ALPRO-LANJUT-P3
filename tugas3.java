import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int nim, tugas1, tugas2, tugas3;
        System.out.println("===Daftar Nilai Mata Kuliah Algoritma===");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIM: ");
        nim = input.nextInt();

    		System.out.print("Masukkan Nilai Tugas 1 : ");
    	tugas1 = input.nextInt();
    		System.out.print("Masukkan Nilai Tugas 2 : ");
    	tugas2 = input.nextInt();
    		System.out.print("Masukkan Nilai Tugas 3 : ");
    	tugas3 = input.nextInt();

    	double rataRata = (tugas1 + tugas2 + tugas3) / 3;

    	System.out.println("----------------------------------------------------------------------");
		        System.out.println("| Nama\t| NIM\t| Tugas 1\t| Tugas 2\t| Tugas 3\t| Rata-rata\t|");
		        System.out.println(" " + nama + "\t " + nim + "\t " + tugas1 + "\t\t " + tugas2 + "\t\t " + tugas3 + "\t\t " + rataRata + "\t\t");
		}
}
