import java.util.Scanner;

public class menghitungLuasKelilingSegitiga {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double sisiA;
        double sisiB;
        double sisiC;
        double alas;
        double tinggi;
        double kelSG;
        double luasSG;

        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Masukan alas: ");
        alas = myObj.nextDouble();

        System.out.println("Masukan tinggi: ");
        tinggi = myObj.nextDouble();

        System.out.println("Menghitung Keliling Segitiga");
        System.out.println("Masukan sisi A: ");
        sisiA = myObj.nextDouble();

        System.out.println("Masukan sisi B: ");
        sisiB = myObj.nextDouble();

        System.out.println("Masukan sisi C: ");
        sisiC = myObj.nextDouble();

        luasSG = 0.5 * alas * tinggi;
        kelSG = sisiA + sisiB + sisiC;

        System.out.println("Hasil");
        System.out.println("Luas segitiga :" + luasSG);
        System.out.println("Keliling segitiga :" + kelSG);

        myObj.close();
    }
}
