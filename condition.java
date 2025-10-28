import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
         Scanner ns = new Scanner(System.in);
         int nilaiMTK;
         int nilaiInggris;
         int fisika;

         System.out.println("Masukan Nilai MTK : ");
         nilaiMTK = ns.nextInt();

         System.out.println("Masukan Nilai Inggris : ");
         nilaiInggris = ns.nextInt();

         System.out.println("Masukan Nilai Fisika : ");
         fisika = ns.nextInt();

        if (nilaiMTK == 75 && nilaiInggris != 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda Tidak Lulus");
        }

        if (nilaiInggris > 90 || fisika < 75) {
            System.out.println("Selamat Anda Lulus Dengan Nilai Memuaskan");
        } else {
            System.out.println("Anda Bisa Mencoba Lagi Untuk Mendapatkan Nilai Lebih Baik");
        }

        
        
    }
}
