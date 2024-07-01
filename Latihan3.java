import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
String nama;
        int nim, tugas;
        int [] jumlahmahasiswa;
        int [] jumlahTugas;

        System.out.println("Daftar Nilai Mata Kuliah Algoritma");
        System.out.print("Masukkan jumlah masasiswa: ");
        jumlahMahasiswa=input.nextInt();
         System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas=input.nextInt();
        //dek
        namaMahasiswa= new String[jumlahMahasiswa];

for(int i=0;i<jumlahMahasiswa;i++){
	  System.out.print("Mahasiwa ke-" + (i+1));
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIM: ");
        nim = input.nextInt();
        System.out.print("Masukkan Jumlah Tugas: ");
	        int jumlahTugas = input.nextInt();
	        for (int d = 0; d < jumlahTugas; d++) {
            System.out.println("Tugas ke-" + d + ":");

            double rataRata = (i / jumlahTugas);

			    System.out.println("Nama : " + nama);
			    System.out.println("Nim : " + nim);

			    System.out.println("Rata-rata : " + rataRata);
}
}
}
}